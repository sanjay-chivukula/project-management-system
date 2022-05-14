public interface User {


  String getUserId();
  String getPhone();
  String getEmail();
  String getAddress();
  UserRole getUserRole();
  Account getAccount();

  void setUserId(String userId);
  void setPhone(String phone);
  void setEmail(String email);
  void setAddress(String address);
  void setUserRole(UserRole userRole);
  void setAccount(Account account);
}
