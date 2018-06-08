package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    int result[];
    String output="(";
    int i=1, loopCount =0;
    long time;

    @RequestMapping("/random")
    public String greeting(@RequestParam(value="limit") int number) {
        i = 1;
        loopCount = 0;
        time = System.nanoTime();
        random(number);
        return output;
    }




    private void random(int limit){
        output="(";
        // Random r=new Random();
        result =new int[limit];

        result[0]=1;
        result[limit-1]=limit;
        recursive(1,limit);


//if(i==53){}
        int temp,d;
        temp=1+(int)(Math.random()*(limit-1));
        d= result[temp];
        result[temp]= result[0];
        result[0]=d;


        temp = 1 + (int) (Math.random() * (limit - 1));
        d= result[temp];
        result[temp]= result[limit-1];
        result[limit-1]=d;


        System.out.println(loopCount);

        for(int f = 0; f< result.length; f++){
            output+=String.valueOf(result[f])+")  (";
            System.out.println(String.valueOf(f)+"--"+String.valueOf(result[f]));
        }

        output += " // *LOOPCOUNT* = " + loopCount + " )" + " // *Time taken* = " + String.valueOf((System.nanoTime() - time) / 1000000f) + " milli sec";

    }




    private void recursive(int start, int end){
        int j;
        loopCount++;

        /*else if(start<(end-1))*/

        result[i]=start+(int)(Math.random()*(end-start));
        j=i;i++;


        if(result[j]==start || result[j]== (start+1)){
            result[j]=start+1;

            if(result[j]<(end-1)){
                recursive(result[j],end);}
        }


        else if(result[j]==end || result[j]== (end-1)){
            result[j]=end-1;

            if(start<(result[j]-1)){
                recursive(start, result[j]);
            }
        }

        else{
            recursive(result[j], end);
            recursive(start, result[j]);
        }

    }




}



