/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilecallalertstatedesign;

public class SilentState implements MobileCallAlertStatus
{
     public void callAlert(AlertStateDesign asd)
    {
        System.out.println("Mobile is in Silent state............");
    }
}
