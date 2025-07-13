### Introduction.

**Platform Overview**:

LinkedIn is an employment-oriented social networking platform designed for managing professional identities and facilitating career development.

**Key Functions**:
1. Enables professional networking and career growth.
2. Allows users to find and connect with trusted professionals.
3. Employers can post job listings, and job seekers can post resumes.

**User Profiles and Interaction**:
1. Users can create detailed profiles showcasing education, experience, skills, achievements, and endorsements.
2. Interactive features include posting content, commenting, sending direct messages, and forming groups. Pages)

**Personalised Experience**:
1. Generates a personalised feed based on users' connections, job history, educational background, group memberships, and content interactions.

### LinkedIn Platform Requirements Overview

This document delineates the essential requirements for the LinkedIn platform, ensuring a clear guideline for functionalities aimed at enhancing professional networking and career development.
1. **Profile Customization**: Users can enrich their profiles with educational background, work experiences, achievements, and skills, offering a comprehensive professional summary.
2. **Search and Exploration**: Users have the capability to search for and view other users' profiles, pages, and groups, fostering networking and community engagement.
3. **Connection Management**: Users can send, cancel, accept, or ignore connection requests, enabling them to curate their professional network.
4. **Following Users**: The platform allows users to follow others without needing to connect, expanding their access to diverse professional insights and updates.
5. **Insights and Analytics**: Users can view analytics related to their connections, profile views, post impressions, and search appearances, offering valuable feedback on their professional visibility.
6. **Recommendations**: Users can request and provide professional recommendations, enhancing the credibility and value of their professional network.
7. **Content Creation**: Users have the ability to create and share new posts, contributing to the professional discourse within their network.
8. **Engagement with Content**: Users can interact with posts through reactions, shares, and comments, and also engage with comments on posts, fostering a vibrant professional community.
9. **Messaging**: Direct communication is facilitated through messaging, allowing users to send and receive messages with other professionals.
10. **Notifications**: The system will notify users about new messages, connection requests, and interactions with their content, keeping them informed and engaged.
11. **Company Pages**: Users can create pages for companies and follow other company pages, connecting them with corporate entities and professional opportunities.
12. **Job Listings**: Company pages can feature job openings, enabling users to explore and apply for career opportunities.
13. **Groups**: Users have the option to create and join professional groups, encouraging the exchange of ideas and networking within specific interest areas or industries.

```java
class Subject {
    void attach(Observer observer){}
    void detach(Observer observer){}
    void notifyMessage(){}
}

interface Observer {
    void update(String message);
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

      private String accountId;
      private String password;
      private String username;
      private String email;
      AccountStatus status;

      public abstract boolean resetPassword();
}

enum JobStatus {
      OPEN,
      ON_HOLD,
      CLOSED;
}

enum ConnectionInviteStatus {
      PENDING,
      ACCEPTED,
      IGNORED;
}

class Address {
      private int zipCode;
      private String streetAddress;
      private String city;
      private String state;
      private String country;
}

enum AccountStatus {
      ACTIVE,
      DEACTIVATED,
      BLOCKED,
      DELETED;
}

class Post {
      int postId;
      User postOwner;
      String text;
      ArrayList<Character> media;
      int totalReacts;
      int totalShares;
      ArrayList<Comment> comments;

      boolean updateText(){
            return true;
      }
}
class Message {
      int messageId;
      User sender;
      ArrayList<User> recipients;
      String text;
      ArrayList<Character> media;
      boolean addRecipients(ArrayList<User> recipients){
            return true;
      }
}

class ConnectionInvitation {
      User sender;
      User recipients;
      String dateCreated;
      ConnectionInviteStatus status;

      boolean acceptConnection(){
            return true;
      }
      boolean rejectConnection(){
            return true;
      }
}
class Comment {
      int commentId;
      User commentOwner;
      String text;
      int totalReacts;
      ArrayList<Comment> comments;


      boolean updateText(){
            return true;
      }
}

class SearchCatalog implements Search {
      HashMap<String, ArrayList<User>> users;
      HashMap<String, ArrayList<CompanyPage>> companies;
      HashMap<String, ArrayList<Job>> jobs;
      HashMap<String, ArrayList<Group>> groups;



      void addNewUser(User user){}
      void addNewCompany(CompanyPage company){}
      void addNewGroup(Group group){}
      void addNewJob(Job job){}


      public ArrayList<User> searchUser(String name)
      {
            // functionality
            ArrayList<User> res = new ArrayList<>();
            return res;
      }

      public ArrayList<CompanyPage> searchCompany(String name)
      {
            // functionality
            ArrayList<CompanyPage> res = new ArrayList<>();
            return res;
      }

      public ArrayList<Group> searchGroup(String name)
      {
            // functionality
            ArrayList<Group> res = new ArrayList<>();
            return res;
      }


      public ArrayList<Job> searchJob(String title)
      {
            // functionality
            ArrayList<Job> res = new ArrayList<>();
            return res;
      }
}
interface Search {
      ArrayList<User> searchUser(String name);
      ArrayList<CompanyPage> searchCompany(String name);
      ArrayList<Group> searchGroup(String name);
      ArrayList<Job> searchJob(String title);
}
class Notification {
      int notificationId;
      String createdOn;
      String content;

      boolean sendNotification(Account account){
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

      boolean addExperience(Experience experience){
            return true;
      }
      boolean addEducation(Education education){
            return true;
      }
      boolean addSkill(Skills skill){
            return true;
      }
      boolean addAchievement(Achievement achievement){
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

      boolean updateDescription(){
            return true;
      }
      void attach(Observer observer)
      {
            members.add(observer);
      }
      void detach(Observer observer)
      {
            // erase the entry of observer from members vector
      }
      void notifyMessage()
      {
            // loop over members
            for (Observer observer : members)
            {
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

      boolean createJobPosting(){
            return true;
      }
      boolean deleteJobPosting(Job job){
            return true;
      }
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

      boolean sendMessage(Message message){return true;}
      boolean sendInvite(ConnectionInvitation invite){return true;}
      boolean cancelInvite(ConnectionInvitation invite){return true;}
      boolean createPage(CompanyPage page){return true;}
      boolean deletePage(CompanyPage page){return true;}
      boolean createGroup(Group group){return true;}
      boolean deleteGroup(Group group){return true;}
      boolean createPost(Post post){return true;}
      boolean deletePost(Post post){return true;}
      boolean createComment(Comment comment){return true;}
      boolean deleteComment(Comment comment){return true;}
      boolean react(Post post){return true;}
      boolean requestRecommendation(User user){return true;}
      boolean acceptRecommendation(User user){return true;}
      boolean applyForJob(Job job){return true;}

      @Override
      public void update(String message) {

      }
}
abstract class Person {

      private String name;
      private Address address;
      private String email;
      private String phone;
      private Account account;
}
class Admin extends Person {

      boolean blockUser(User user){
            return false;
      }
      boolean unblockUser(User user){
            return false;
      }
      boolean disablePage(CompanyPage page){
            return false;
      }
      boolean enablePage(CompanyPage page){
            return false;
      }
      boolean deleteGroup(Group group){
            return false;
      }
}
```