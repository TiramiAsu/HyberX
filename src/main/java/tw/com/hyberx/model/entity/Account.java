package tw.com.hyberx.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "account")
public class Account implements Serializable {

	private static final long serialVersionUID = -5608241289036967005L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", length = 255, nullable = false)
	private String name;

	@Column(name = "password", nullable = false)
	private String password;

	@ManyToOne
	@JoinColumn(name = "m_id",
//	referencedColumnName = "id",
	nullable = false)
	private Member m_id;

	@Column(name = "status", nullable = false)
	private Integer status;

	@Column(name = "error_times", nullable = false)
	private Integer errorTimes;

	@Column(name = "time_build", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date timeBuild;

	@Column(name = "time_modify", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date timeModify;
	
	public Account() {}

	public Account(String name, String password, Member m_id, Integer status, Integer errorTimes, Date timeBuild,
			Date timeModify) {
		this.name = name;
		this.password = password;
		this.m_id = m_id;
		this.status = status;
		this.errorTimes = errorTimes;
		this.timeBuild = timeBuild;
		this.timeModify = timeModify;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Member getM_id() {
		return m_id;
	}

	public void setM_id(Member m_id) {
		this.m_id = m_id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getErrorTimes() {
		return errorTimes;
	}

	public void setErrorTimes(Integer errorTimes) {
		this.errorTimes = errorTimes;
	}

	public Date getTimeBuild() {
		return timeBuild;
	}

	public void setTimeBuild(Date timeBuild) {
		this.timeBuild = timeBuild;
	}

	public Date getTimeModify() {
		return timeModify;
	}

	public void setTimeModify(Date timeModify) {
		this.timeModify = timeModify;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", password=" + password + ", m_id=" + m_id + ", status="
				+ status + ", errorTimes=" + errorTimes + ", timeBuild=" + timeBuild + ", timeModify=" + timeModify
				+ "]";
	}

}
