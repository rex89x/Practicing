import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';

/**
 * Generated class for the DetailPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-detail',
  templateUrl: 'detail.html',
})
export class DetailPage {

  //---------------
  //----成員-------
  //---------------
  name='';
  desc='';
  rec='';
  reco='';
  pic='';
  lat=0;
  lng=0;
  

  //---------------
  //----建構元-------
  //---------------
  constructor(public navCtrl: NavController, public navParams: NavParams) {
    this.name=this.navParams.get('name');
    this.desc=this.navParams.get('desc');
    this.rec=this.navParams.get('rec');
    this.reco=this.navParams.get('reco');
    this.pic=this.navParams.get('pic');
    this.lat=this.navParams.get('lat');
    this.lng=this.navParams.get('lng');
  }

  //---------------
  //----函式------
  //---------------

  ionViewDidLoad() {
    console.log('ionViewDidLoad DetailPage');
  }

  goMap() {
    this.navCtrl.push('MapPage', {name:this.name, lat:this.lat, lng:this.lng});
  }

}
