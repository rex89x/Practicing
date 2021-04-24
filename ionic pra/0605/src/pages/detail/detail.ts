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
  

  //---------------
  //----建構元-------
  //---------------
  constructor(public navCtrl: NavController, public navParams: NavParams) {
    this.name=this.navParams.get('name');
    this.desc=this.navParams.get('desc');
    this.rec=this.navParams.get('rec');
    this.reco=this.navParams.get('reco');
    this.pic=this.navParams.get('pic');
  }

  //---------------
  //----函式------
  //---------------

  ionViewDidLoad() {
    console.log('ionViewDidLoad DetailPage');
  }

  goMap() {
    this.navCtrl.push('MapPage');
  }

}
