package base;

public class Person {
    private String name;
    private int age;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name is " + name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
    	System.out.println("Set age is " + age);
        this.age = age;
    }
    
    public String getJob() {
    	return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
