package api.rest.turnos.model.swagger;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Organizacion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-11T00:45:19.203Z[GMT]")


public class Organizacion   {
  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("cuit")
  private BigDecimal cuit = null;

  @JsonProperty("direccion")
  private String direccion = null;

  @JsonProperty("telefono")
  private BigDecimal telefono = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("clave")
  private String clave = null;

  public Organizacion nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
   **/
  @Schema(description = "")
  
    public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Organizacion cuit(BigDecimal cuit) {
    this.cuit = cuit;
    return this;
  }

  /**
   * Get cuit
   * @return cuit
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getCuit() {
    return cuit;
  }

  public void setCuit(BigDecimal cuit) {
    this.cuit = cuit;
  }

  public Organizacion direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }

  /**
   * Get direccion
   * @return direccion
   **/
  @Schema(description = "")
  
    public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public Organizacion telefono(BigDecimal telefono) {
    this.telefono = telefono;
    return this;
  }

  /**
   * Get telefono
   * @return telefono
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getTelefono() {
    return telefono;
  }

  public void setTelefono(BigDecimal telefono) {
    this.telefono = telefono;
  }

  public Organizacion email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(description = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Organizacion clave(String clave) {
    this.clave = clave;
    return this;
  }

  /**
   * Get clave
   * @return clave
   **/
  @Schema(description = "")
  
    public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organizacion organizacion = (Organizacion) o;
    return Objects.equals(this.nombre, organizacion.nombre) &&
        Objects.equals(this.cuit, organizacion.cuit) &&
        Objects.equals(this.direccion, organizacion.direccion) &&
        Objects.equals(this.telefono, organizacion.telefono) &&
        Objects.equals(this.email, organizacion.email) &&
        Objects.equals(this.clave, organizacion.clave);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, cuit, direccion, telefono, email, clave);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organizacion {\n");
    
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    cuit: ").append(toIndentedString(cuit)).append("\n");
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    clave: ").append(toIndentedString(clave)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
