import { Component, ElementRef, EventEmitter, Output, ViewChild } from '@angular/core';
import { Persona } from '../persona.model';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent {
  
  @Output() personaCreada = new EventEmitter<Persona>();

  @ViewChild('messi') lionel: ElementRef ;
  @ViewChild('ronaldo') cristiano: ElementRef;

  agregarPersona(){
    let persona2 = new Persona(
      this.lionel.nativeElement.value, 
      this.cristiano.nativeElement.value);
    this.personaCreada.emit(persona2);
  }

}
