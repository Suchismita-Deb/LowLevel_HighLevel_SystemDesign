package org.example.LowLevelDesignSystemExample.DesignLinkedin;
import java.util.ArrayList;
import java.util.HashMap;

enum JobStatus {
  OPEN, ONHOLD, CLOSED
}

enum ConnectionInviteStatus {
  PENDING, ACCEPTED, IGNORED
}

enum AccountStatus {
  ACTIVE, DEACTIVATED, BLOCKED, DELETED
}



interface Search {
  ArrayList<User> searchUser(String name);

  ArrayList<CompanyPage> searchCompany(String name);

  ArrayList<Group> searchGroup(String name);

  ArrayList<Job> searchJob(String title);
}


class Analytics {
  private int searchAppearances;
  private int profileViews;
  private int postImpressions;
  private int totalConnections;
}

class Achievement {
  private String title;
  private String dateAwarded;
  private String description;
}

abstract class Account {

  AccountStatus status;
  private String accountId;
  private String password;
  private String username;
  private String email;

  public abstract boolean resetPassword();
}

class Address {
  private int zipCode;
  private String streetAddress;
  private String city;
  private String state;
  private String country;
}

class Post {
  int postId;
  User postOwner;
  String text;
  ArrayList<Character> media;
  int totalReacts;
  int totalShares;
  ArrayList<Comment> comments;

  boolean updateText() {
    return true;
  }
}

class Message {
  int messageId;
  User sender;
  ArrayList<User> recipients;
  String text;
  ArrayList<Character> media;

  boolean addRecipients(ArrayList<User> recipients) {
    return true;
  }
}

class ConnectionInvitation {
  User sender;
  User recipients;
  String dateCreated;
  ConnectionInviteStatus status;

  boolean acceptConnection() {
    return true;
  }

  boolean rejectConnection() {
    return true;
  }
}

class Comment {
  int commentId;
  User commentOwner;
  String text;
  int totalReacts;
  ArrayList<Comment> comments;

  boolean updateText() {
    return true;
  }
}

class SearchCatalog implements Search {
  HashMap<String, ArrayList<User>> users;
  HashMap<String, ArrayList<CompanyPage>> companies;
  HashMap<String, ArrayList<Job>> jobs;
  HashMap<String, ArrayList<Group>> groups;

  void addNewUser(User user) {}

  void addNewCompany(CompanyPage company) {}

  void addNewGroup(Group group) {}

  void addNewJob(Job job) {}

  public ArrayList<User> searchUser(String name) {
    // functionality
    ArrayList<User> res = new ArrayList<>();
    return res;
  }

  public ArrayList<CompanyPage> searchCompany(String name) {
    // functionality
    ArrayList<CompanyPage> res = new ArrayList<>();
    return res;
  }

  public ArrayList<Group> searchGroup(String name) {
    // functionality
    ArrayList<Group> res = new ArrayList<>();
    return res;
  }

  public ArrayList<Job> searchJob(String title) {
    // functionality
    ArrayList<Job> res = new ArrayList<>();
    return res;
  }
}

class Notification {
  int notificationId;
  String createdOn;
  String content;

  boolean sendNotification(Account account) {
    return true;
  }
}

class Profile {
  String headline;
  String about;
  String gender;
  ArrayList<Character> profilePicture;
  ArrayList<Character> coverPhoto;

  ArrayList<Experience> experiences;
  ArrayList<Education> educations;
  ArrayList<Skills> skills;
  ArrayList<Achievement> achievements;
  ArrayList<Recommendation> recommendations;
  Analytics analytics;

  boolean addExperience(Experience experience) {
    return true;
  }

  boolean addEducation(Education education) {
    return true;
  }

  boolean addSkill(Skills skill) {
    return true;
  }

  boolean addAchievement(Achievement achievement) {
    return true;
  }
}

class Education {
  String school;
  String degree;
  String startDate;
  String endDate;
  String description;
}

class Experience {
  String title;
  String company;
  Address location;
  String startDate;
  String endDate;
  String description;
}

class Skills {
  String name;
}

class Recommendation {
  int userId;
  String createdOn;
  String description;
  boolean isAccepted;
}

class Job {
  int jobId;
  String jobTitle;
  String dateOfPosting;
  String description;
  CompanyPage company;
  String employmentType;
  Address location;
  JobStatus status;
}

class Group extends Subject {
  int groupId;
  String name;
  String description;
  int totalMembers;
  ArrayList<Observer> members;

  boolean updateDescription() {
    return true;
  }

  void attach(Observer observer) {
    members.add(observer);
  }

  void detach(Observer observer) {
    // erase the entry of observer from members vector
  }

  void notifyMessage() {
    // loop over members
    for (Observer observer : members) {
      //            observer.update("Hey new post in the group");
    }
  }
}

class CompanyPage {
  int pageId;
  String name;
  String description;
  String type;
  int companySize;
  User createdBy;
  ArrayList<Job> jobs;

  boolean createJobPosting() {
    return true;
  }

  boolean deleteJobPosting(Job job) {
    return true;
  }
}

interface Observer {
  void update(String message);
}
class Subject {
  void attach(Observer observer) {}

  void detach(Observer observer) {}

  void notifyMessage() {}
}
class User extends Person implements Observer {

  int userId;
  String dateOfJoining;
  Profile profile;

  ArrayList<User> followsUsers; // contain most recent 10 follows
  ArrayList<CompanyPage> followCompanies;
  ArrayList<User> connections;
  // vector<User> followsUsers;
  // vector<CompanyPage> followCompanies;
  ArrayList<Group> joinedGroups;
  ArrayList<CompanyPage> createdPages;
  ArrayList<Group> createdGroups;

  boolean sendMessage(Message message) {
    return true;
  }

  boolean sendInvite(ConnectionInvitation invite) {
    return true;
  }

  boolean cancelInvite(ConnectionInvitation invite) {
    return true;
  }

  boolean createPage(CompanyPage page) {
    return true;
  }

  boolean deletePage(CompanyPage page) {
    return true;
  }

  boolean createGroup(Group group) {
    return true;
  }

  boolean deleteGroup(Group group) {
    return true;
  }

  boolean createPost(Post post) {
    return true;
  }

  boolean deletePost(Post post) {
    return true;
  }

  boolean createComment(Comment comment) {
    return true;
  }

  boolean deleteComment(Comment comment) {
    return true;
  }

  boolean react(Post post) {
    return true;
  }

  boolean requestRecommendation(User user) {
    return true;
  }

  boolean acceptRecommendation(User user) {
    return true;
  }

  boolean applyForJob(Job job) {
    return true;
  }

  @Override
  public void update(String message) {}
}

abstract class Person {

  private String name;
  private Address address;
  private String email;
  private String phone;
  private Account account;
}

class Admin extends Person {

  boolean blockUser(User user) {
    return false;
  }

  boolean unblockUser(User user) {
    return false;
  }

  boolean disablePage(CompanyPage page) {
    return false;
  }

  boolean enablePage(CompanyPage page) {
    return false;
  }

  boolean deleteGroup(Group group) {
    return false;
  }
}

public class LinkedinSystem {
  public static void main(String[] args){

  }
}
