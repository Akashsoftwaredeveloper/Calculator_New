package array;

public class DemoArray {
    public void demo() {
        // syntax of Array : Data type variable_name [] ={,,,,}

        String[] namearray = {"test", "john", "spring", "spring boot", "rahul"};

        for (int i = 0; i < namearray.length; i++)

            System.out.println("NaME ---" + namearray[i]);

        }

        public static void main (String[]args){
            DemoArray obj = new DemoArray();
            obj.demo();

        }
    }
