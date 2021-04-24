import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { Flashlight } from '@ionic-native/flashlight';
import { Vibration } from '@ionic-native/vibration';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  constructor(public navCtrl: NavController, private flashlight: Flashlight, private vibration: Vibration) {
  }

  turnOn(){
    this.flashlight.switchOn(); 
    this.vibration.vibrate([2000]);
  }
  turnOff(){
    this.flashlight.switchOff();
    this.vibration.vibrate([2000]);
  }

  
  
}
