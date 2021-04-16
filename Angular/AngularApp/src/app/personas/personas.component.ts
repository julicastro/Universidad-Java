import { Component } from "@angular/core";

@Component({
    selector: 'app-personas',
    templateUrl: './personas.component.html',
    styleUrls: ['./personas.component.css']
 
})
export class PersonasComponent{
    deshabilitar = true;
    mensaje = "No se ha agregado ninguna persona";
    titulo  = "Programador";

    agregarPersona(){
        this.mensaje = "Persona agregada";
    }
    
    // modificarTitulo(event: Event){
    //     this.titulo = (<HTMLInputElement>event.target).value;
    //     // cada vez q modificamos input html obtenemos un nuevo valor
    //     // se despliega valor de la variable titulo
    // }

}