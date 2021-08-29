public class NewList {
    //Suraj Kopparam

	private String[] array;	
    private int size;
    
    public NewList(){
        size =0;
        array = new String[10]; 
    }

    public void add(String element){
        if(size ==array.length){
            String[]temp =new String[size*2];
            for(int i=0; i<size;i++){
                temp[i]=array[i];
            }
            array =temp;
        }
        array[size] = element;
        size++;
    }

    public void add(int index, String element){
        
        if(size == array.length){
            String[] temp = new String [size*2];
            for(int i=0; i<size;i++){
                temp[i]=array[i];
            }
            array =temp;
        }
        

    }

    public void addAll(NewList list){
        
    }

    
    public void clear(){

    }
    public boolean contains (String element){
        return true; //delete
    }

    public String get(int index){
        return array[index];
    }
    
    public int indexOf(String element){
        for(int i =0; i<size; i++){
            if(array[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        boolean ans = false;
        for(int i =0; i<size; i++){
            if(array[i]!=null){
                ans = true;
            }
        }
        return ans;
    }

    public int lastIndexOf(String element){
        return 5; //delete
    }

    public String remove (int index){
        String removed= array[index];
        for(int i=index;i<array.length;i++){
            array[i] = array[i+1];
        }
        array[array.length]=null;
        size--;
        return removed;
    }

    public void set(int index, String element){
        array[index]= element;
    }
    
    public int size(){
        return size;
    }
}
