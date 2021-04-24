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

  //------------
  //member
  //------------
  name='';
  desc='';
  pic='';
  personPic='';
  person='';
  lat=0;
  lon=0;

  //------------
  //constructor
  //------------

  constructor(public navCtrl: NavController, public navParams: NavParams) {
  //------------
  //function
  //------------
  this.name=this.navParams.get('name');
  this.desc=this.navParams.get('desc');
  this.pic=this.navParams.get('pic');
  this.personPic=this.navParams.get('personPic');
  this.person=this.navParams.get('person');
  this.lat=this.navParams.get('lat');
  this.lon=this.navParams.get('lon');
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad DetailPage');
  }

  goMap(name, lat, lon){
    this.navCtrl.push ('MapPage',{name:name, lat:lat, lon:lon});
  }

}
