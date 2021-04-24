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
  name='';
  reco='';
  rec='';
  pic='';
  desc='';
  url='http://120.97.27.220';

  constructor(public navCtrl: NavController, public navParams: NavParams) {
    this.name=navParams.get('name');	
    this.reco=navParams.get('reco');	
    this.rec=navParams.get('rec');	
    this.pic=navParams.get('pic');	
    this.desc=navParams.get('desc');	
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad DetailPage');
  }

}
