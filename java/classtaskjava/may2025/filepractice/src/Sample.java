import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        System.out.println(IntStream
                .rangeClosed(0, 10)
                .sum());

        Comparator<Integer> comparator = (first, second) -> {
            if(first > second) return -1;
            if(first < second) return 1;
            return 0;
        };

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumber = numbers.stream()
                .filter(
                        (number) -> number % 2 == 0
                )
                .map((number) -> number * number * number)
                .sorted(comparator)
                .toList();
        System.out.println(evenNumber);


        User user = new User();
        user.setPassword("123456");
        user.setEmail("john@smith.com");
        user.setFirstName("John");
        user.setLastName("Smith");

        User user1 = new User();
        user1.setPassword("123456");
        user1.setEmail("john@smith.com");
        user1.setFirstName("John");
        user1.setLastName("Smith");

        List<User> users = List.of(user);
        List<UserDto> stringUser = users
                .stream()
                .map(UserDto::new)
                .toList();

        System.out.println(stringUser);


        List<User> users1 = List.of(user, user1);
        List<UserDto> stringUsers = users1
                .stream()
                .sorted((first, second) -> {
                    if(first.getFirstName().length() > second.getFirstName().length()) return -1;
                    else if (first.getFirstName().length() < second.getFirstName().length()) return 1;
                    else return 0;
                })
                .map(UserDto::new)
                .toList();
        System.out.println(stringUsers);

        //reduce
        //compare
        //collect -> terminal
        //foreach
        //map
        //rangeClosed
    }
}
