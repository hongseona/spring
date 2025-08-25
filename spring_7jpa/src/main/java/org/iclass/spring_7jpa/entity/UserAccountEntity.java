package org.iclass.spring_7jpa.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = "password")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_account")
@Entity
public class UserAccountEntity {
	// @Enumer
	@Column(nullable = false)
	private String userid;

	@Column(nullable = false)
	private String username;

	@Column(nullable = "password")
	private String password;

	@Column(name = "birth")		// 생년월일은 주로 날짜만 사용해서 LocalDate 사용
	private LocalDate birth;

	@Column(name = "Gender")
	private String gender;

	@Column(name = "email")
	private String email;

	@Column(name = "regdate")
	private LocalDate regDate;


}
