package manytomany.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomany.dto.Course;
import manytomany.dto.Student;

public class Studentdao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}

	public void savestudent(Student student) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}

	public void findstudent(int id) {
		EntityManager entityManager = getEntityManager();
		Student dbstudent = entityManager.find(Student.class, id);
		if (dbstudent != null) {
			System.out.println(dbstudent);

		} else {
			System.out.println("id not present");
		}

	}
	
	public void deletestudent(int id) {
		EntityManager entityManager = getEntityManager();
		Student dbstudent = entityManager.find(Student.class, id);
		if (dbstudent != null) {
			// is std is present then can delete data
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbstudent);
			entityTransaction.commit();

		} else {
			System.out.println("id not present");
		}

	}
	
	public void updatestudent(int id,Student student) {
		EntityManager entityManager = getEntityManager();
		Student dbstudent = entityManager.find(Student.class, id);
		if (dbstudent != null) {
			// is std is present then can delete data
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			student.setId(id);
			student.setCourse(dbstudent.getCourse());
			entityManager.merge(student);
			entityTransaction.commit();

		} else {
			System.out.println("id not present");
		}

	}
}
