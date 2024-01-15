package manytomany.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import manytomany.dto.Course;
import manytomany.dto.Student;

public class Coursedao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}

	public void savecourse(Course course) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(course);
		entityTransaction.commit();
	}

	public void findcourse(int id) {
		EntityManager entityManager = getEntityManager();
		Course dbcourse = entityManager.find(Course.class, id);
		if (dbcourse != null) {
			System.out.println(dbcourse);

		} else {
			System.out.println("id not present");
		}

	}

	public void deletecourse(int id) {
		EntityManager entityManager = getEntityManager();
		Course dbcourse = entityManager.find(Course.class, id);
		if (dbcourse != null) {
			// if present can dlete
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbcourse);
			entityTransaction.commit();

		} else {
			System.out.println("id not present");
		}

	}

	public void updatecourses(int id, Course course) {
		EntityManager entityManager = getEntityManager();
		Course dbcourse = entityManager.find(Course.class, id);
		if (dbcourse != null) {
			// prsent can update
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			course.setId(id);
			entityManager.merge(course);
			entityTransaction.commit();

		} else {
			System.out.println("id not present");
		}

	}

	public void findAllCourses() {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("select u from Course u");

		List<Course> list = query.getResultList();
		System.out.println(list);

	}
}
