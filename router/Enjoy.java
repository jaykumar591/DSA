package router;

public class Enjoy {
     static class Student implements Comparable<Student>{
        String name ;
        int rank;

        public Student(String name , int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTO(Student s2){
            return this.rank - s2.rank;
        }
     } 
}
