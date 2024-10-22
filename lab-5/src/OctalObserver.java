public class OctalObserver extends Observer{
public Boolean status = false;
   public OctalObserver(Subject subject){
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
     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
   }
}