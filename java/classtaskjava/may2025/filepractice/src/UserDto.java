public class UserDto {
    private String firstName;
    private String lastName;

    public UserDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserDto(User user) {
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
    }
}
