package pillihuaman.com.Help;


public class Constants {

	public static final String CONSULTA_PERSONAS_POR_DOCUMENTO = "CONSULTA PERSONAS POR DOCUMENTO";
	
	public static final String BASE_ENDPOINT = "{access:private|public}/v1";

	private Constants() {
		super();
	}

	public static final String OPERACION_EXITOSA = "operación exitosa";

	public static final String CONFIG_PERFIL_EXITOSA = "Configuracion de perfil exitosa";

	public static final String LISTA = "Lista";

	public static final String ERROR_VALIDACION = "error de validación";
	
	public static final String ERROR_INTERNO = "error interno";

	public static final String CAMPO = "Campo";
	
	public static final String ES_OBLIGATORIO = "es obligatorio";
	
	public static final String ES_INVALIDO = "es inválido"; 
	
	public static final String BEARER_JWT = "bearer-key";
	
	public static final String SERVER_200 = "200";
	
	public static final String SERVER_500 = "500";
	
	public static final String SERVER_400 = "400";
	
	public static final String SUM_OBT_LIST = "Obtiene una Lista de ";

	public static final String JWT = "jwt";

	public static final long REGIMEN_LABORAL = 1;
	
	public static final long MODALIDAD = 2;
	
	public static final long TIPO = 3;
	
	public static final String MENSAJE_CONFIGURACION_MAESTRA = "No Existe el configMaestraId Ingresado";
	public static final String MENSAJE_ENTIDAD_VACIO= "El entidadId no puede ser nulo"; 
	
	public static final String MENSAJE_ACTIVO = "ACTIVO";
	
	public static final String MENSAJE_INACTIVO = "INACTIVO";

	//estos datos debe considerarse el codigo de registro pendiente de implementar en maestra
	public static final String  REGIMEN_LABORAL_30057 = "1";
	public static final String  REGIMEN_LABORAL_276 = "2";
	public static final String  REGIMEN_LABORAL_728 = "3";
	public static final String  REGIMEN_LABORAL_1401 = "4";
	public static final String  REGIMEN_LABORAL_1057 = "5";

	public static final String COD_REG_LABORAL_276  = "PUB";
	public static final String COD_REG_LABORAL_728  = "PRI";
	public static final String COD_REG_LABORAL_1401  = "PRA";
	public static final String COD_REG_LABORAL_1057 = "CAS";
			
	public static final String GUION = "-";
	
	public static final String FORMAT_DATE_AUDIT = "yyyy-MM-dd HH:mm:ss";
	
	public static final String FORMATO_TIMEZONE = "UTC";


	public static final String ACTIVO = "1";
	public static final String INACTIVO = "0";
	public static final Long HABILIDADES = 1l;
	public static final Long REQUISITOS = 2l;
	
	
	public static final String CONDICION_CONCLUIDO = "1";
	public static final String CONDICION_OBSERVADO = "0";
	public static final String MSJ_PUNTAJE_TOTAL = "PUNTAJE TOTAL";
	
	public static final String REGEX_DESCRIPCION_BONIFICACION = "{0} = (+ {1}% sobre el Puntaje Total).";
	public static final String PARAM_INDEX_0 = "{0}";
	public static final String PARAM_INDEX_1 = "{1}";
	
	
//	public static final long  COD_MAE_CABECERA_TIPOINFORME = 18;
	public static final String ETAPA_BASE_OBSERVADO = "1";
	public static final String ETAPA_BASE_NO_OBSERVADO= "0";

	public static final String COD_TABLA_TIPO_INFORME = "TIP_INF";
	public static final String COD_TI_BONIFICACION = "2";
	public static final String COD_TI_CRITERIO_EVALUACION = "4";
	public static final String COD_TABLA_ESTADO_CRONOGRAMA = "TIP_ETA_PRO";
	public static final String COD_EST_DIFUSION = "1";
	public static final String COD_EST_RECLUTAMIENTO = "2";
	public static final String COD_EST_ELECCION = "4";
	public static final String COD_EST_COMU_PUBLICADO = "5";
	
	public static final long ENTIDAD_ORG_TIPO = 81;
	
	public static final String EXTENSION_PDF = ".pdf";
	public static final String PARAMETRO_FILE = "RUTAS_FILE";
	public static final String PAR_CODIGO_TEXTO = "RUTA_FILE_SERVER_ENTIDAD";
	public static final String PATH_ENTIDAD = "{entidadId}";
	public static final String PATH_PARAMETRO = "{tipoParametro}";
	
	public static final String COD_PRO_MA_DET_EN_PROCESO = "1";
	public static final String COD_PRO_MA_DET_POR_REVISAR = "2";
	public static final String COD_PRO_MA_DET_OBSERVADO = "4";
	public static final String COD_PRO_MA_DET_POR_PUBLICAR = "6";
    public static final String COD_PRO_MA_DET_PUBLICADA = "5";
	public static final String COD_TABLA_SITUACION_ETAPA = "TIP_ETA_RE";
	public static final String COD_PRO_MA_DET_BONIFICACION = "2";
	
	
    public static final String ENTIDAD_KEY = "entidad";
    public static final String ACCESS_TOKEN_KEY = "accessToken";
    public static final String NOMBRE_ENTIDAD_KEY = "razonSocial";
    public static final String URL_WEB = "urlWeb";
    
    
    public static final String ESTADO_REQ_MINIMO_PENDIENTE ="1";
    public static final String ESTADO_EVA_CURRICULAR_PENDIENTE = "1";

    public static final String COD_REGIMEN = "TBL_REGIMEN";
    public static final String COD_TIPO_CONOCIMIENTO = "TBL_MAE_TIPO_CONO";
    public static final String COD_CATEGORIA_CONOCIMIENTO = "TBL_MAE_CATE_CONO";
    public static final String COD_CONOCIMIENTO_TECNICO = "1";
    public static final String COD_CONOCIMIENTO_CURSOS = "2";
    public static final String COD_CONOCIMIENTO_PROGRAMA = "3";
    public static final String COD_CONOCIMIENTO_OFIMATICA = "4";
    public static final String COD_CONOCIMIENTO_IDIOMA = "5";

	public static final String TRANSACCION_NAME = "convocatoriaTransactionManager";
    
    public static final String ISSERVIR_DECLARA_JURADA_ESPECIF = "0";

    public static final String COD_TABLA_EST_COMUNICADO = "EST_COMUNI";
    public static final String COD_TIPO_COMUNICADO_DESIERTA = "3";
    
    public static final String COD_TABLA_EST_CONVOCATORIA = "TIP_EST_CONV";
    public static final String COD_ESTADO_EN_PROCESO = "1";
    public static final String COD_ESTADO_DESIERTO = "2";
    public static final String COD_ESTADO_CANCELADA = "3";
    public static final String COD_ESTADO_GENERADO = "5";

	public static final String PERFIL_NO_EXISTE = "Perfil no existe";
    
	public static final String IND_FLAG_0= "0";
	public static final String IND_FLAG_1 = "1";
	
	public static final  long COD_EXPRIENCIA_LABORAL_GENERAL = 1;
	public static final long COD_EXPRIENCIA_LABORAL_ESPECIFICA = 2;
	public static final long COD_EXPRIENCIA_LABORAL_GERENCIAL = 3;
 
	
	public static final String COD_TABLA_EST_CONTRATO = "TBL_EST_CONT_CONV";
	public static final String COD_ESTADO_PENDIENTE = "1";
	public static final String COD_ESTADO_CREADO = "2";
	
	public static final long COD_EXPERIENCIA_GENERAL = 1;
	public static final long COD_EXPERIENCIA_ESPECIFICA_MATERIA = 2;
	public static final long COD_EXPERIENCIA_ESPECIFICA_SECTOR_PUBLICO = 3;
	public static final long COD_EXPERIENCIA_GERENCIAL = 4;
	public static final long COD_EXPERIENCIA_ESPECIFICA = 5;
	
	public static final String COD_TABLA_TIPO_TRABAJO = "TIP_TRABAJO";
	public static final String PRE_ADJ_DESE_CONTRATO = "CONTDES";
	public static final String PRE_ADJ_SUSC_CONTRATO = "CONTSUS";
	public static final String PRE_ADJ_SUSC_CONVENIO = "CONVSUS";
	public static final String PRE_ADJ_DESE_CONVENIO = "CONVDES";

	public static final String FORMATO_FECHA_DD_MM_YYYY_HORA = "dd/MM/yyyy HH:mm:ss";
}
