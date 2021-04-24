import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { ScenePage } from './scene';

@NgModule({
  declarations: [
    ScenePage,
  ],
  imports: [
    IonicPageModule.forChild(ScenePage),
  ],
})
export class ScenePageModule {}
