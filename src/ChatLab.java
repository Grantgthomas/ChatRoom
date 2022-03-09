/**
 * Created by Grant on 2/18/2018.
 */
public class ChatLab {

    Person CurrentPerson = new Person();
    

    public class Person {

        public Person() {
            String firstName = "";
            char middleInitial;
            String lastName = "";
            String PUID = "";
            String message = "";
            String question = "";
        }

        public void sendMessage(String message){

        }

        public String receiveMesage(){
            String returnVal = "";
            return returnVal;
        }

        public void sendQuestion(String question){

        }

        public String recieveQuestion(){
            String returnVal = "";
            return returnVal;
        }

    }



}


