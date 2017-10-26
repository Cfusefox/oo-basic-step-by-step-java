package practice01;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class Practice01Test {
    @Test
    public void should_person_have_name_and_age() throws Exception {
        Person person = new Person("Tom", 21);
        assertThat(person.getName()).isEqualTo("Tom");
        assertThat(person.getAge()).isEqualTo(21);
    }
}
