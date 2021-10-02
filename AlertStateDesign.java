/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilecallalertstatedesign;

  public class AlertStateDesign 
  {
  private MobileCallAlertStatus presentState;
  public AlertStateDesign()
  {
      presentState=new VibrationState();
  }
  public void enableState(MobileCallAlertStatus state)
  {
      presentState=state;
  }
  public void callAlert()
  {
      presentState.callAlert(this);
  }
}
