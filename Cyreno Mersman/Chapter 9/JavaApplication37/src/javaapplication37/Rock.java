
package javaapplication37;


public class Rock {
    
    private int num_of_samps = 0;
    private String desc = " ";
    private int weight = 0;
    
    public Rock(int num_of_samps, int weight){
    
    this.num_of_samps = num_of_samps;
    this.weight = weight;
    
    desc = "Unclassified";
    }
     public int getNum_of_samps() {
        return num_of_samps;
    }

    public void setNum_of_samps(int num_of_samps) {
        this.num_of_samps = num_of_samps;
    }
   
    public String getDesc() {
        return desc;
    }
   
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
}
