package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User name = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername() == login ) {
                name = users[i];
            }
        }
        if (name.getUsername() == null ) {
            throw new UserNotFoundException("User not found");
        }
        return name;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = true;
        if (user.isValid() == false || user.getUsername().length() <= 3) {
            rsl = false;
            throw new UserInvalidException("User is not valid");
        }
        return rsl;
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
