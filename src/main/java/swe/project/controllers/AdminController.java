package main.java.swe.project.controllers;

import java.util.List;

import main.java.swe.project.models.User;

public class AdminController {
  private List<User> users;

  public AdminController() {
    loadUsers();
  }

  /*
   * Think a way to make the load user from JSON from Admin Side
   * use JSON
   * 
   */
  private void loadUsers() {

  }

  public void run() {
    System.out.println("Welcome to the Admin Console Application!");
  }
}
