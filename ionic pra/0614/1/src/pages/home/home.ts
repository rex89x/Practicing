import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
//---------------------------------------
import { Http } from '@angular/http';
//---------------------------------------

@Component({
    selector: 'page-home',
    templateUrl: 'home.html'
})
export class HomePage {
    //---------------------------------  
    // 成員
    //---------------------------------  
    items=[];
    url='http://120.97.27.220';
    urlService='http://120.97.27.220/?no=1';
    //---------------------------------  


    //---------------------------------  
    // 建構元
    //---------------------------------  
    constructor(public navCtrl: NavController, public http:Http) {
        this.loadData();		
    }
    //---------------------------------  


    //---------------------------------  
    // 自訂函式
    //---------------------------------     
    goDetail(name, introduction, district){
        this.navCtrl.push('DetailPage', {name:name, introduction:introduction, district:district});
    }
      

    //---------------------------------  
    // 自訂函式
    //---------------------------------     
    loadData(){
      this.http.get(this.urlService).subscribe(response => {
          this.items=response.json(); 
      });	     
    }
    //---------------------------------      
}
