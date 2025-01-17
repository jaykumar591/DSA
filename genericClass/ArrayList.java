package genericClass;

public class ArrayList<type> {

    type data;
    ArrayList<type> next;
    int size = 0;

    public ArrayList(type data) {
        this.data = data;
        this.next = null;
    }
    
    

    
    public void addLast(type data) {
        ArrayList<type> current = this;
        size++;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ArrayList<>(data);
    }

    public void addFisrt(type data){
        ArrayList<type> current = this;
        size++;
        ArrayList<type> newData = new ArrayList<type>(data);
        newData.next = current;
        current = newData; 
    }
    public void addPos(int pos , type data){
        ArrayList<type> current = this;
        if(pos<0 || pos>size){
            System.out.println("Invalid index");
            return;
        }
        if(pos==0){
            addFisrt(data);
            return;
        }
        if(pos==size){
            addLast(data);
            return;
        }
       
        ArrayList<type> prev = current;
        ArrayList<type> curr = current.next;
        for(int i=1; i<pos; i++){
            prev = prev.next;
            curr = curr.next;
        }
        ArrayList<type> newData = new ArrayList<>(data);
        prev.next = newData;
        newData.next = curr;

    }
    public void printList() {
        ArrayList<type> current = this;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    
}
