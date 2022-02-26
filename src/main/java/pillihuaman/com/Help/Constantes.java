package pillihuaman.com.Help;

import java.math.BigDecimal;

import com.google.gson.Gson;


public class Constantes {
public static final String CONSULTA_PERSONAS_POR_DOCUMENTO = "CONSULTA PERSONAS POR DOCUMENTO";

	public static final String BASE_ENDPOINT = "{access:private|public}/v1";

	private Constantes() {
		super();
	}

	public static final String OPERACION_EXITOSA = "operaci�n exitosa";
	
	public static final String ERROR_VALIDACION = "error de validaci�n";
	
	public static final String ERROR_INTERNO = "error interno";

	public static final String FIELD = "Field";
	
	public static final String IS_REQUIRED = "is required";
	
	public static final String ES_INVALIDO = "es inv�lido"; 
	
	public static final String BEARER_JWT = "bearer-key";
	
	public static final String SERVER_200 = "200";
	
	public static final String SERVER_500 = "500";
	
	public static final String SERVER_400 = "400";
	
	public static final String ENDPOINT_TIPO_PARAMETRO = "/v1/tiposparametro/{tipoParametro}/parametros";
	
	public static final String ENDPOINT_OBTENER_PERSONA_BY_DOCUMENTO = "/v1/personas/documentoQuery";
	
	public static final String FORMATO_FECHA_DD_MM_YYYY = "dd/MM/yyyy";
	
	public static final String FORMATO_FECHA_YYYY_MM_DD = "yyyy-MM-dd";
	
	public static final String ENDPOINT_INS_PERSONA_JURIDICA = "/v1/personas/juridicas";
	
	public static final String ENDPOINT_INS_PERSONA_NATURAL = "/v1/personas/naturales";
	
	public static final String ENDPOINT_CREAR_USUARIO = "/v1/usuarios";
	
	public static final String ENDPOINT_OBTENER_USUARIO = "/v1/usuarios/{usuarioId}";
	
	public static final String ENDPOINT_ASIGNAR_ROLES = "/v1/usuarios/roles";
	
	public static final String ENDPOINT_BUSCAR_ROLES_USUARIO = "/v1/usuarios/{usuarioId}/roles";
	
	public static final String ENDPOINT_BUSCAR_USUARIO_FILTRO = "/v1/usuarios/query";
			
	public static final String TIPO_TELEFONO_CASA = "CAS";
	
	public static final String TIPO_TELEFONO_CELULAR = "CEL";
	
	public static final String TIPO_CORREO_PRINCIPAL = "PRINC";

	public static final String TIPO_CORREO_ALTERNO = "ALTER";
	
	public static final String ENDPOINT_CREAR_TELEFONO = "/v1/personas/{personaId}/telefonos";
	
	public static final String ENDPOINT_CREAR_CORREO = "/v1/personas/{personaId}/correos";
	
	public static final String ENDPOINT_TELEFONO = "/v1/telefonos/{telefonoId}";
	
	public static final String ENDPOINT_CORREO = "/v1/correos/{correoId}";
	
	public static final String SP_BUSCAR_EMAIL = "SP_BUSCAR_EMAIL";
	
	public static final String ENDPOINT_ENVIAR_CORREO = "/v1/email/enviar";
	
	public static final String ENDPOINT_SUBIR_ARCHIVO = "/v1/file/upload";
	
	public static final String ENDPOINT_INS_IMAGEN = "/v2/file/upload";
	
	public static final String ENDPOINT_PAIS_QUERY = "/v1/pais/query";
	
	public static final String ENDPOINT_USUARIO_ENTIDAD = "/v1/entidades/{entidadId}/usuarios";
	
	public static final String ENDPOINT_ACTUALIZAR_ESTADO_ROL = "v1/usuarioRoles/{usuarioRolId}";
	
	public static final String ENDPOINT_ASIGNAR_USUARIO_ENTIDAD = "/v1/entidades/{entidadId}/usuarios/{usuarioId}/estado/{estadoRegistro}";	
	
	public static final String ENDPOINT_ASIGNA_GRUPO_ENTIDAD= "/v1/entidades/{entidadId}/grupos/{grupoId}/usuarios/{usuarioId}";
	
	public static final String ES_INVALIDA = "es inv�lida"; 
	
	public static final String ENDPOINT_OBTENER_PERSONA_BY_ID = "/v1/personas/{personaId}";
	
	public static final String ENDPOINT_OBTENER_TELEFONO_BY_PERSONAID = "/v1/personas/{personaId}/telefonos";
	
	public static final String ENDPOINT_OBTENER_CORREO_BY_PERSONAID = "/v1/personas/{personaId}/correos"; 
		
	public static final String ESTADO_ACTIVO = "1";
	
	public static final String COD_PLANTILLA_CREATE_USER_POSTULACION = "POS_BVNDA";
	
	public static final String CORREO_CONTACTO_PROPERTY = "CORREO_CONTACTO";
	
	public static final String CORREOS_ENVIO = "correosEnvio";
	
	public static final String CORREOS_COPIA = "correosCopia";
	
	public static final String CORREOS_COPIA_OCULTA = "correosCopiaOculta";
	
	public static final String PARAMETROS = "parametros";
	
	public static final String PLANTILLA_USUARIO_EXISTENTE = "USER_EXIST";
	
	public static final String NOTIFICACION_SISTEMA = "NOTIFICACION DEL SISTEMA TALENTO PERU";
	
	public static final String FLAG_VERDADERO = "1";
		
	public static final String FLAG_FALSO = "0";
	
	public static final Double RATIO_CAMBIO_PERFIL = 0.4;
	
	public static final Double RATIO_CAMBIO_PORTADA = 0.6;
	
	public static final String RUTAS_FILE_SERVER = "RUTAS_FILE";
	
	public static final String RUTA_FILE_SERVER_POSTULACION = "RUTA_FILE_SERVER_POSTULACION";
	
	public static final String DIRECTORIO_PERFIL = "/perfil";
	
	public static final String DIRECTORIO_PORTADA = "/portada";
	
	public static final String POSTULANTE_NO_EXISTE = "EL POSTULANTE NO EXISTE";
	
	public static final String NIVEL_NO_EXISTE = "EL NIVEL NO EXISTE";

	public static final String IDIOMA_NO_EXISTE = "EL IDIOMA NO EXISTE";

	public static final String INVESTIGACION_NO_EXISTE = "INVESTIGACION NO EXISTE";

	public static final String INDICADOR_NO_EXISTE = "INDICADOR NO EXISTE";

	public static final String FLAG_UNO_CERO = "1|0";
	
	public static final String TIPO_FORMACION_SUPERIOR = "S";
	
	public static final String TIPO_FORMACION_BASICA = "B";
	
	public static final String DIRECTORIO_DOCUMENTOS = "/documentos";
	
	public static final String FORMACION_NO_EXISTE = "Formacion Academica no existe";
	
	public static final String ESPECIALIZACION_NO_EXISTE = "Especializacion no existe";
	
	public static final String CERTIFICACION_NO_EXISTE = "Certificacion no existe";
	
	public static final String VACIO = "";
	
	public static final String TIPO_TELEF_PRINC = "PRINC";
	
	public static final String TIPO_TELEF_PER = "PER";
	
	public static final String TIPO_TELEF_CEL = "CEL";
	
	public static final String DIRECTORIO_FFAA = "/ffaa";
	
	public static final String DIRECTORIO_IPD = "/ipd";

	public static final String DIRECTORIO_CONADIS = "/conadis";

	public static final String PALABRA_ERROR = "ERROR";
	
	public static final String ERROR_RUTA_FILE_NO_EXISTE = "ERROR RUTA FILE POSTULACION NO EXISTE";
	
	public static final String ERROR_API_INSERTA_IMAGEN = "ERROR AL LLAMAR API DE INSERTAR IMAGEN";

	public static final String ENDPOINT_DOWNLOAD_BASE64 = "/v1/file/downloadBase64";

	public static final String ENDPOINT_UBIGEO_FULL = "/v1/ubigeos/{origen}/full/{ubigeo}";
	
	public static final String UBIGEO_RENIEC = "reniec";
	
	public static final String ENDPOINT_UBIGEO_DEPARTAMENTOS = "/v1/ubigeos/reniec/departamentos";
	
	public static final String ENDPOINT_UBIGEO_PROVINCIAS = "v1/ubigeos/reniec/departamentos/{idDept}/provincias";
	
	public static final String ENDPOINT_UBIGEO_DISTRITOS = "v1/ubigeos/reniec/provincias/{idProv}/distritos";
	
	public static final String TRANSACCION_NAME = "postulanteTransactionManager";
	
	public static final String CORREO_YA_EXISTE = "correo ya existe";
	
	public static final String CORREO_YA_REGISTRADO = "correo ya registrado anteriormente";
	
	public static final String ERROR_OPERACION = "OCURRIO UN ERROR EN LA OPERACION";
	
	public static final String MARCA_ERROR = "{\"trace\":";
	
	public static final String ENDPOINT_OBTENER_LISTA_DETALLE_MAESTRA = "/v1/maestraDetalle";
	
	public static final String CODIGO_NIVEL_ACADEMICO = "";	
		
	public static final String CODIGO_TBL_PER_NIV_EDU = "TBL_PER_NIV_EDU";
	
	public static final String CODIGO_TBL_PER_EST_NIV_EDU = "TBL_PER_EST_NIV_EDU";
	
	public static final String CODIGO_TBL_PER_SIT_ACA = "TBL_PER_SIT_ACA";
			
	public static final String CODIGO_SITUACION_ACADEMICA_SUP = "SITUA_ACADEMICA_SUP";
	
	public static final String CODIGO_NIVEL_EDUCATIVO_BASIC = "NIVEL_EDUCATIVO_BASIC";
	
	public static final String CODIGO_NIVEL_EDUCATIVO_SUP = "NIVEL_EDUCATIVO_SUP";
	
	public static final String CODIGO_CARRERAS = "CARRERAS";
	
	public static final String CODIGO_ESTADO_BASIC = "ESTADO_BASIC";
	
	public static final String ENDPOINT_OBTENER_CARRERAS_BY_SITUACION = "/v1/capacitacion/carrera/{situacionId}";
	
	public static final String PENDIENTE = "pendiente";

	public static final String JWT = "jwt";
	
	public static final String OFIMATICA_NO_EXISTE = "Conocimiento Ofimatica No existe";
	
	public static final String CODIGO_MAESTRA_PROGRAMA = "PROGRAMA";
	
	public static final String CODIGO_MAESTRA_NIVEL_CONOCIMIENTO = "NIVEL_CONOCIMIENTO";
	
	public static final String CREA = "Crea";
	
	public static final String BUSCA = "Busca";
	
	public static final String ANULA = "Anula";
	
	public static final String ACTUALIZA = "Actualiza";
	
	public static final String OBTENER_LISTA = "Obtiene una lista";
	
	public static final String CODIGO_CURSO_PROGRAMA = "TBL_PERFIL_DIP_ESP";
	
	public static final String CODIGO_INSTITUCION = "TBL_INSTITUCION";
	
	public static final String CODIGO_CURSO = "TBL_PERFIL_CUR_TAL";
	
	public static final String CODIGO_REGIMEN = "TBL_REGIMEN";
	
	public static final String ENDPOINT_OBTENER_LISTA_DET_MA_CODIGO = "/v1/maestraDetalle";
	
	public static final String DIRECTORIO_EXPERIENCIA = "/experienciaLaboral";
	
	public static final String EXPERIENCIA_NO_EXISTE = "EXPERIENCIA NO EXISTE";
	
	public static final String CODIGO_NIVEL_PUESTO = "TBL_PER_NIV_MIN_PTO";
	
	public static final String CODIGO_MOTIVO_CESE = "TBL_MOTIVO_CESE";
	
	public static final String OCURRIO_ERROR = "Ocurrio un error: ";
	
	public static final String MENSAJE_OK = "OK";
	
	public static final String ENDPOINT_OBTENER_LISTA_CARRERAS = "/v1/capacitacion/carrera";
	
	public static final Long IDENTIFICADOR_PRIVADO = 8L;
	
	public static final Long IDENTIFICADOR_PUBLICO = 9L;
	
	/*	
	public static final String CODIGO_PROG_NIVEL_PRIMARIO = "7";
	
	public static final String CODIGO_PROG_NIVEL_SECUNDARIO = "6";
	
	public static final int TIPO_DOCUMENTO_RUC = 6;
	
	public static final int TIPO_DOCUMENTO_DNI = 1;
	
	public static final int TIPO_DOCUMENTO_CARNET = 4;
	
	public static final int TIPO_PERSONA_JURIDICO = 23;
	
	public static final int TIPO_PERSONA_NATURAL = 22;
	
	public static final Long ID_ROL_POSTULANTE = 29L;*/

	public static final Gson CONVER_TO_JSON = new Gson();
	public static final String HEADER_USUARIOBEAN = "X-Custom-Udata";
	public static final Long VALOR_LONG_0 = (long) 0;
	public static final BigDecimal VALOR_BIGDECIMAL_0 = new BigDecimal("0");
	public static final String CADENA_VACIA = "";
	public static final String SLASH = "/";
	public static final String PUNTO = ".";
	public static final String GUION = "-";
	public static final String PIPE = "|";
	public static final String SIGNO_MAYOR = ">";
	public static final String SIGNO_MENOR = "<";
	public static final String SIGNO_MAYOR_IGUAL = "<=";
	public static final String SIGNO_MENOR_IGUAL = ">=";
	public static final String EXCEPTION_PRE_DECLARACION = "ExceptionPreDeclaracion";
	public static final String INDICADOR_ACTIVO = "1";
	public static final String INDICADOR_INACTIVO = "0";
	public static final String INDICADOR_ELIMINADO = "1";
	public static final String INDICADOR_NO_ELIMINADO = "0";
	public static final String INDICADOR_RPTA_ERROR = "1";
	public static final String INDICADOR_RPTA_EXITOSO = "0";
	public static final String RUC_PERSONA_NATURAL = "10";
	public static final String RUC_PERSONA_JURIDICA = "20";
	public static final String RUC_PERSONA_JURIDICA_15 = "15";
	public static final String RUC_PERSONA_JURIDICA_17 = "17";

	public static final String CODIGO_TIPO_DOC_DNI = "01";
	public static final String CODIGO_TIPO_DOC_RUC = "06";

	public static final String FORM_PERSONA_NATURAL = "0709";
	public static final String FORM_PERSONA_JURIDICA = "0710";
	public static final String COD_USUARIO_TOPICO = "usuarioTopico";

	public static final String DESC_ERROR_EVENTO_NO_CTRLDO_CUS = "Evento no controlado por CU";
	public static final String DESC_ERROR_BD = "Error de conectividad de BD";
	public static final String DESC_ERROR_JSON = "Error de interpretaci\u00f3n del JSON (malformado)";
	public static final String DESC_ERROR_FECHA = "fecha de la transacci\u00f3n es menor a la fecha de inicio de implementaci\u00f3n de CU";
	public static final String DESC_ERROR_DDPCONTRIBUYENTE = "No se encontr\u00f3 el detalle de la anulaci\u00f3n";
	public static final String DESC_ERROR_PAGONOSENCUENTRAANULADO = "El pago no se encuentra anulado";
	public static final String DESC_ERROR_NOENCONTRODETALLEANULACION = "No se encontr\u00f3 el detalle de la anulaci\u00f3n";
	public static final String DESC_ERROR_NOENCONTRODETALLEDECLARACION = "No se encontr\u00f3 el detalle de la declaraci\u00f3n";
	public static final String DESC_ERROR_TIP_DOCUMENT = "Tipo de documento no controlado por CU";
	public static final String DESC_ERROR_SUNAT= "Error en SUNAT";

	public static final String CASILLAS_OF_FORMAT_DATE_INPUT_DDMMYYYY = "790";
	public static final String DESC_USER_CU = "usuRegisCU";

	public static final String TOPICO_TECNOLOGIA_SES_PORENVIAR_AED = "topic-tecnologia-ses-porenviar-aed";
	public static final String TOPICO_TECNOLOGIA_SES_RESPUESTA = "topic-tecnologia-ses-respuesta";
	public static final String TOPICO_TECNOLOGIA_SCUC_PORENVIAR_LEGADOS = "topic-tecnologia-scuc-porenviar-legados";
	public static final String TOPICO_TECNOLOGIA_SCUC_RESPUESTA_LEGADOS = "topic-tecnologia-scuc-respuesta-legados";

	public static final String CODIGO_ERROR_2001 = "2001";
	public static final String CODIGO_ERROR_2002 = "2002";
	public static final String CODIGO_ERROR_2003 = "2003";
	public static final String CODIGO_ERROR_2004 = "2004";
	public static final String CODIGO_ERROR_2005 = "2005";
	public static final String CODIGO_ERROR_2006 = "2006";
	public static final String CODIGO_ERROR_2007 = "2007";
	public static final String CODIGO_ERROR_2008 = "2008";
	public static final String CODIGO_ERROR_2009 = "2009";
	public static final String CODIGO_ERROR_2010 = "2010";
	public static final String CODIGO_ERROR_2011 = "2011";
	public static final String CODIGO_ERROR_2012 = "2012";
	public static final String CODIGO_ERROR_2013 = "2013";

	public static final String MENSAJE_ERROR_2001 = "La longitud del D.N.I. indicado no es v\u00e1lido";
	public static final String MENSAJE_ERROR_2002 = "La longitud del R.U.C. indicado no es v\u00e1lido";
	public static final String MENSAJE_ERROR_2003 = "Cliente debe ser diferente al Emisor";
	public static final String MENSAJE_ERROR_2004 = "La longitud del documento indicado no es v\u00e1lido";
	public static final String MENSAJE_ERROR_2005 = "Datos no v\u00e1lido para el documento '-' ";
	public static final String MENSAJE_ERROR_2006 = "Longitud no v\u00e1lida para la raz\u00f3n Social";
	public static final String MENSAJE_ERROR_2007 = "El DNI ingresado no existe o no es v\u00e1lido";
	public static final String MENSAJE_ERROR_2008 = "El RUC ingresado no existe o no es v\u00e1lido";
	public static final String MENSAJE_ERROR_2009 = "Debes ingresar un correo v\u00e1lido";
	public static final String MENSAJE_ERROR_2010 = "M\u00ednimo 5 caracteres para el campo desServicio";
	public static final String MENSAJE_ERROR_2011 = "Monto Total por Honorarios ingresado debe ser mayor a cero";
	public static final String MENSAJE_ERROR_2012 = "Solo puedes registrar 20 recibos por honorarios como frecuentes";
	public static final String MENSAJE_ERROR_2013 = "La fecha de emisi\u00f3n no es v\u00e1lida";

	public static final String CODIGO_ERROR_422 = "422";
	public static final String CODIGO_ERROR_500 = "500";

	public static final String MENSAJE_ERROR_500 = "Internal Server Error - Se present\u00f3 una condici\u00f3n inesperada que impidi\u00f3 completar el Request";
	public static final String MENSAJE_ERROR_422 = "Unprocessable Entity - Se presentar\u00f3n errores de validaci\u00f3n que impidieron completar el Request";

	public static final int CODIGO_CARACTER_0 = 0;
	public static final int CODIGO_CARACTER_15 = 15;
	public static final int CODIGO_CARACTER_5 = 5;
	public static final int CODIGO_CARACTER_60 = 60;
	public static final int CODIGO_CARACTER_100 = 100;
	public static final int CODIGO_CARACTER_250 = 250;

	public static final int NUMERO_DIAS_02 = 2;
	
	public static final String DATE_FORMAT = "yyyy-MM-dd";
	public static final String DATE_FORMAT_JSON = "yyyy-MM-dd'T'HH:mm:ss.SSS";

	public static final String HOUR_START_FORMAT_MONGO = "T00:00:00Z";
	public static final String HOUR_END_FORMAT_MONGO = "T23:59:59Z";

	public static final String TIME_ZONE_GMT_5 = "GMT-5:00";
	
	public static final int INICIAR_PROCESO = 0;
	
	public static final int PROCESO_EXITOSO = 1;
	
	public static final int ERROR_PROCESO = 2;

	public static final String INSERTAR_RECIBO_RHE = "001";
	public static final String INSERTAR_PAGORECIBO_RHE = "002";
	public static final String INSERTAR_BAJARECIBO_RHE = "003";
	public static final String INSERTAR_NUEVOEMISOR_RHE = "004";
	public static final String INSERTAR_REVERTIR_RHE = "005";
	
	public static final String LINEA_CABECERA = "================================================================================";
	
	public static final String SCHEMA_VERSION_MONGO = "1.0";
}
