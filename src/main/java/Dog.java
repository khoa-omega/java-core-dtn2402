public class Dog {
    String name;
    int age;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Dog)) return false;
        Dog that = (Dog) object;
        return this.name.equals(that.name)
                && this.age == that.age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 2 * age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public String toString() {
//        return String.format(
//                "Dog[name=%s,age=%d]",
//                name, age
//        );
//    }
}
