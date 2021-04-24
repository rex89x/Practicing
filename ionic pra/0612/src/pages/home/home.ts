import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
//---------------------------------------
import { Http } from '@angular/http';
//---------------------------------------
import { ToastController } from 'ionic-angular';

@Component({
    selector: 'page-home',
    templateUrl: 'home.html'
})
export class HomePage {
    //---------------------------------  
    // 成員
    //---------------------------------  
    items=[];
    webHttp='http://120.97.27.220';
    //---------------------------------  


    //---------------------------------  
    // 建構元
    //---------------------------------  
    constructor(public navCtrl: NavController, public http:Http, private toastCtrl: ToastController) {
        this.loadData();		
    }
    //---------------------------------  


    //---------------------------------  
    // 自訂函式
    //---------------------------------     
    goDetail(name, desc, pic, rec, reco){
        this.navCtrl.push('DetailPage', {name:name, desc:desc, pic:pic, rec:rec, reco:reco});
    }
      

    //---------------------------------  
    // 自訂函式
    //---------------------------------     
    loadData(){
      this.http.get(this.webHttp).subscribe(response => {
          this.items=response.json(); 
          this.presentToast();
      });	     
    }
    //---------------------------------  
    // 自訂函式
    //---------------------------------     
    doRefresh(refresher) {
      this.loadData();
  
      setTimeout(() => {
        console.log('Async operation has ended');
        refresher.complete();
      }, 2000);
    }
  
    //---------------------------------  
    // 自訂函式
    //--------------------------------- 
    presentToast() {
      let toast = this.toastCtrl.create({
        message: '資料已更新',
        duration: 2000,
        position: 'bottom'
      });
    
      toast.onDidDismiss(() => {
        console.log('Dismissed toast');
      });
    
      toast.present();
    }
        //--------------------------------- 
}