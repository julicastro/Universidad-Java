import { Injectable, EventEmitter } from "@angular/core";
import { LoggingService } from "./LoggingService.service";
import { Persona } from "./persona.model";

@Injectable()
export class PersonasService{
    personas: Persona[] = [
        new Persona("Julian", "Castro"), 
        new Persona("Leo", "Messi"),
        new Persona("Cristiano", "Ronaldo")
      ];

  saludar = new EventEmitter<number>();

  constructor(private logginService: LoggingService){}

      agregarPersona(persona: Persona){
        this.logginService.enviarMensajeAConsola("Agregar Persona: " + persona.nombre);
        this.personas.push( persona );
      }
}