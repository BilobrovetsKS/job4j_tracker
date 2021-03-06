package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                user = users[i];
                break;
            }
        }
        if (user == null ) {
            throw new UserNotFoundException("User not found");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() <= 3) {
            throw new UserInvalidException("User is not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Kirill", true)
            };
            User user = findUser(users, "Kirill");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        }catch (UserInvalidException ei) {
            ei.printStackTrace();
        }catch (UserNotFoundException en) {
            en.printStackTrace();
                }
    }
}
