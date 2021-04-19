import { Component, ElementRef, ViewChild } from '@angular/core';
import { LoggingService } from '../LoggingService.service';
import { Persona } from '../persona.model';
import { PersonasService } from '../personas.service';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
 
})
export class FormularioComponent {
  
  @ViewChild('nombreInput') nombreInput: ElementRef ;
  @ViewChild('apellidoInput') apellidoInput: ElementRef;

  constructor(private logginService: LoggingService,
              private personasService: PersonasService){
                this.personasService.saludar.subscribe(
                  (indice: number) => alert("El indice es: " + (indice + 1))
                );

  }

  agregarPersona(){
    let persona1 = new Persona(this.nombreInput.nativeElement.value, 
    this.apellidoInput.nativeElement.value);
   // this.logginService.enviarMensajeAConsola("Enviamos persona" + persona1.nombre + " " + persona1.apellido);
   // this.personaCreada.emit(persona1);
   this.personasService.agregarPersona(persona1);
  }

}
