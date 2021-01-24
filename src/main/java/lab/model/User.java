package lab.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "clients")
public class User {
	private Long id;
	private String surname;
	private String name;
	private String lastname;
	private String comment;
	private String mail;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	//private Collection<JournalsEntity> journalsById;

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "surname", nullable = false, length = 255)
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Basic
	@Column(name = "name", nullable = false, length = 255)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "lastname", nullable = false, length = 255)
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Basic
	@Column(name = "comment", nullable = false, length = 255)
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Basic
	@Column(name = "mail", nullable = false, length = 255)
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Basic
	@Column(name = "created_at", nullable = true)
	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	@Basic
	@Column(name = "updated_at", nullable = true)
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		User that = (User) o;

		if (id != null ? !id.equals(that.id) : that.id != null) return false;
		if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
		if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
		if (mail != null ? !mail.equals(that.mail) : that.mail != null) return false;
		if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
		if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (surname != null ? surname.hashCode() : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
		result = 31 * result + (comment != null ? comment.hashCode() : 0);
		result = 31 * result + (mail != null ? mail.hashCode() : 0);
		result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
		result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
		return result;
	}
/*
	@OneToMany(mappedBy = "clientsByClientId")
	public Collection<JournalsEntity> getJournalsById() {
		return journalsById;
	}

	public void setJournalsById(Collection<JournalsEntity> journalsById) {
		this.journalsById = journalsById;
	}*/
}
