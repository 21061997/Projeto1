package br.com.yuri.entity;

	import java.util.Set;

import javax.persistence.*;

	@Entity
	public class User {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		
		private String name;
		private String email;
		
		@ManyToMany
		private Set <Role> roles; // Relacionando a atebla User com role Relacionamento de N pra N
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
		

	}



