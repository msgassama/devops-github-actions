package com.groupeisi.githubcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdApplication {

	public String welcome(){
		return "Welcome to spring lab github-actions";
	}

//	echo "# devops-github-actions" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/msgassama/devops-github-actions.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdApplication.class, args);
	}

}
