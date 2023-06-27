import java.util.HashSet;

class SubsetOfAnotherMap {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>(); // declaring new hashset of name number
        numbers.add(1); // adding elements into set
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("HashSet1: " + numbers);

        HashSet<Integer> primeNumbers = new HashSet<>(); // declaring new hashset of name primeNumber
        primeNumbers.add(2); // adding elements into set
        primeNumbers.add(3);
        System.out.println("HashSet2: " + primeNumbers);

        boolean result = numbers.containsAll(primeNumbers); // checking that all the elements of set primeNumber are in
                                                            // set number
        System.out.println("Is HashSet2 is subset of HashSet1? " + result);
    }
}
