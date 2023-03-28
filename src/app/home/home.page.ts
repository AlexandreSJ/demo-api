import { Component } from '@angular/core';
import { getElement } from 'ionicons/dist/types/stencil-public-runtime';
import { ToastController } from '@ionic/angular';


@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  constructor(private toastController: ToastController) {}

  async presentToast(msg:string) {
    const toast = await this.toastController.create({
      message: msg,
      duration: 4000,
      position: 'top'
    });

    await toast.present();
  }

  showQuery() {
    const input = document.getElementById('name') as HTMLInputElement;
    const getFetch = fetch('http://localhost:8080/req?name='+input.value, { method: 'GET' })
    .then(response => response.json())
    .then(texto => {
      console.log(JSON.stringify(texto))
      return this.presentToast(JSON.stringify(texto))
    })
    .catch(err => console.log(err.message))
  }

  clearQuery() {
    const input = document.getElementById('name') as HTMLInputElement;
    document.getElementById('name')?.setAttribute('value', '')
    const getFetch = fetch('http://localhost:8080/clear', { method: 'GET' })
    .then(response => response.json())
    .then(texto => {
      console.log(JSON.stringify(texto))
      return this.presentToast(JSON.stringify(texto))
    })
    .catch(err => console.log(err.message))
  }
}