public class HexaObserver extends Observer{
public Boolean status = true;
   public HexaObserver(Subject subject){
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
      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
   }
}