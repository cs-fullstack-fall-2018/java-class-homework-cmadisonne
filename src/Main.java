public class Main {

    public static void main(String[] args) {
	Movie movie1 = new Movie();
	movie1.setName("Beautiful Creatures");
    movie1.setRate(9);
    movie1.setYear(2005);

    Movie movie2 = new Movie();
    movie2.setName("Love Jones");
    movie2.setRate(1000);
    movie2.setYear(1998);

    System.out.println(movie1);
    System.out.println(movie2);

    Product product1 = new Product("Banana", 1.1, 13 );
    product1.printProduct("Banana" , 1.1, 13);


    }
}
