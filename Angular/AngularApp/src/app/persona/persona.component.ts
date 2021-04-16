import { Component } from '@angular/core';

@Component({
  selector: 'app-persona',
  templateUrl: './persona.component.html',
  styleUrls: ['./persona.component.css']
})
export class PersonaComponent {

  nombre: string = "Julian";
  apellido: string = "Castro";
  edad: number = 24;
  // private edad: number = 24;

  // getEdad():number{
  //   return this.edad;
  // }
}
