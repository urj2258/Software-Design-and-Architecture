public class BinaryObserver extends Observer{
     public Boolean status = true;
   public BinaryObserver(Subject subject){
      this.subject = subject;
      if(status==true)
          this.subject.attach(this);
      else
      this.subject.detach(this);
   }
   
   public void setStatus(){
       status=true;
   }
   public Boolean isActive(){
       return status;
   }

   @Override
   public void update() {
      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
   }
}