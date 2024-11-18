@Modulo-Fee-Dashboard
Feature: Modulo Fee Dasboard
  Background:
    Given Ingresamos la url del QA,Si
    And Ingresamos credenciales yaquelin.herrera@intelica.com,Frozen1$
    Then Seleccionamos Generate Token
    And buscamos menu
    And buscamos M&V facturas,Fee Dashboard

##----------------------------------------------------------------------------------------------------
## ---------------------------Perfil BANCO TAP-1------------------------------------------------------------------------
##----------------------------------------------------------------------------------------------------

##------------------------PERFIL BANCO TAP-1--------------------------------------------------------------------------

##SCENARIO 1-- Validar Tap 1 Expense Summary - Gross Fees by Scheme and Business Unit-----------------------------------

  Scenario Outline: Validar Tap 1 Expense Summary - Gross Fees by Scheme and Business Unit
    And seleccionamos <idioma>
    And cambiamos <perfil>
    And clickeamos Seccion 1 Mastercard y Visa
    ##Then elegimos TotalMastercard y TotalVisa
    ##And elegimos TotalVisa

    Examples:
      | idioma | perfil             |
      | ENG    | Mexico - Santander |

 ##SCENARIO 2-Validar aplicacion de filtros y descarga de archivo del tap 1 en menu hamburguesa-------------------------
  Scenario Outline: Validar aplicacion de filtros y descarga de archivo del tap 1 en menu hamburguesa
    And seleccionamos <idioma>
    And cambiamos <perfil>
    And presionamos menu hamburguesa
    Then elegimos Filtros
    Then aplicamos <periodo>
    And seteamos date
    And presionamos boton Apply
    And presionamos menu hamburguesa
    Then descargamos archivo

    Examples:
      | idioma | perfil     | periodo    |
      | ENG    | Mexico - Santander | Customized |

 ##SCENARIO 3-Validar limpiar filtros del tap 1 en menu hamburguesa-----------------------------------------------------
  Scenario Outline: Validar limpiar filtros del tap 1 en menu hamburguesa
    And seleccionamos <idioma>
    And cambiamos <perfil>
    And presionamos menu hamburguesa
    Then elegimos Filtros
    Then aplicamos <periodo>
    And seteamos date
    And presionamos boton Clear

    Examples:
      | idioma | perfil             | periodo    |
      | ENG    | Mexico - Santander | Customized |


 ##------------------------PERFIL BANCO TAP-2--------------------------------------------------------------------------
 ##SCENARIO 4-Validar Tap 2 Expense Evolution---------------------------------------------------------------------------
  Scenario Outline: Validar Tap 2 Expense Evolution
    And seleccionamos <idioma>
    And cambiamos <perfil>
      And clickeamos Tap 2 Expense Evolution

    Examples:
      | idioma | perfil             |
      | ENG    | Mexico - Santander |

 ##SCENARIO 5-Validar aplicacion de filtros y descarga de archivo del tap 2 en menu hamburguesa---------------------------------------------------------------------------
  Scenario Outline: Validar aplicacion de filtros y descarga de archivo del tap 2 en menu hamburguesa
    And seleccionamos <idioma>
    And cambiamos <perfil>
    And clickeamos Tap 2 Expense Evolution
    And presionamos menu hamburguesa
    Then elegimos Filtros
    And escogemos <business>,<alcance>,<periodo>,<stard date>,<end date>
    And presionamos boton Apply
    And presionamos menu hamburguesa
    Then descargamos archivo

    Examples:
      | idioma | perfil             | business            | alcance       | periodo | stard date | end date |
      | ENG    | Mexico - Santander | Adquirente efectivo | Internacional | Anual   | 2020       | 2023     |
 ##SCENARIO 6-Validar boton variations en Tap 2 Expense Evolution---------------------------------------------------------------------------
  ##Scenario Outline: Validar boton variations en Tap 2 Expense Evolution
    ##And seleccionamos <idioma>
    ##And cambiamos <perfil>
    ##And clickeamos Tap 2 Expense Evolution
    ##Then presionamos boton variations
    ##And elegimos fee categories <marca>,<negocio>,<alcance>,<tipo transaccion>,<periodo>

   ## Examples:
     ## | idioma |perfil |marca | negocio | alcance       | tipo transaccion | periodo |
     ## | ENG    | Mexico - Santander| Visa                | Emisor        | Internacional | Efectivo   | Anual    |

 ##SCENARIO 7-Validar Taps variations en Expense Evolution Tap 2---------------------------------------------------------------------------
  ##Scenario Outline: Validar Taps variations en Expense Evolution Tap 2
    ##And seleccionamos <idioma>
  ##And cambiamos <perfil>
    ##And clickeamos Tap 2 Expense Evolution
    ##Then presionamos boton variations
    ##And pasamos clics variations

   ## Examples:
   ##   | idioma |perfil|
    ##  | ENG |Mexico - Santander|


 ##----------------------PERFIL BANCO TAP-3-------------------------------------------------------------------------
 ##SCENARIO 8-Validar Tap 3 Expense Details---------------------------------------------------------------------------
  Scenario Outline: Validar Tap 3 Expense Details
    And seleccionamos <idioma>
    And cambiamos <perfil>
    And clickeamos Tap 3 Expense Details
    ## Then cambiamos icono flecha

    Examples:
      | idioma | perfil             |
      | ENG    | Mexico - Santander |

 ##SCENARIO 9-Validar Boton Tarifas relacionadas en Tap 3---------------------------------------------------------------------------
  Scenario Outline: Validar Boton Tarifas relacionadas en Tap 3
    And seleccionamos <idioma>
    And cambiamos <perfil>
    And clickeamos Tap 3 Expense Details
    Then presionamos related fees
    And realizamos busqueda <cuota>

    Examples:
      | idioma | perfil             | cuota       |
      | ENG    | Mexico - Santander | TCC399C1MEX |

 ##SCENARIO 10-Validar aplicacion de filtros y descarga de archivo del tap 3 en menu hamburguesa--------------------------------------------------------
  Scenario Outline: Validar aplicacion de filtros y descarga de archivo del tap 3 en menu hamburguesa
    And seleccionamos <idioma>
    And cambiamos <perfil>
    And clickeamos Tap 3 Expense Details
    And presionamos menu hamburguesa
    Then elegimos Filtros
    And seteamos <marca>,<negocio>
    And presionamos boton Apply
    And presionamos menu hamburguesa
    Then descargamos archivo

    Examples:
      | idioma | perfil             | marca | negocio            |
      | ENG    | Mexico - Santander | Visa  | Adquirente compras |

 ##------------------------PERFIL BANCO TAP-4-----------------------------------------------------------------------
 ##SCENARIO 11-Validar Tap 4 Unit Costs---------------------------------------------------------------------
  Scenario Outline: Validar Tap 4 Unit Costs
    And seleccionamos <idioma>
    And cambiamos <perfil>
    Then clickeamos Tap 4 Unit Costs
    Examples:
      | idioma | perfil             |
      | ENG    | Mexico - Santander |

 ##SCENARIO 12-Validar Pagina filtros y sección 1 en Tap 4----------------------------------------------------------
  Scenario Outline: Validar Pagina filtros y sección 1 en Tap 4
    And seleccionamos <idioma>
    And cambiamos <perfil>
    Then clickeamos Tap 4 Unit Costs
    And elegimos filtros
    And presionamos seccion 1

    Examples:
      | idioma | perfil             |
      | ENG    | Mexico - Santander |

 ##SCENARIO 13-Validar sección 2 y grafico en Tap 4 Unit Cost----------------------------------------------------------
  Scenario Outline: Validar sección 2 y grafico en Tap 4 Unit Cost
    And seleccionamos <idioma>
    And cambiamos <perfil>
    Then clickeamos Tap 4 Unit Costs
    And presionamos seccion 2
    And oprimimos grafico

    Examples:
      | idioma | perfil             |
      | ENG    | Mexico - Santander |

  ##SCENARIO 14-Validar aplicacion de filtros del tap 4 en menu hamburguesa----------------------------------------------------------
  Scenario Outline: Validar aplicacion de filtros del tap 4 en menu hamburguesa
    And seleccionamos <idioma>
    And cambiamos <perfil>
    Then clickeamos Tap 4 Unit Costs
    And presionamos menu hamburguesa
    Then elegimos Filtros
    And filtramos <negocio>,<tipo transaccion>
    Then pulsamos boton Aplicar

    Examples:
      | idioma | perfil             | negocio    | tipo transaccion |
      | ENG    | Mexico - Santander | Adquirente | Efectivo         |

  ##SCENARIO 15-Validar descarga de archivo en Tap 4----------------------------------------------------------
  Scenario Outline: Validar descarga de archivo en Tap 4
    And seleccionamos <idioma>
    And cambiamos <perfil>
    Then clickeamos Tap 4 Unit Costs
    And presionamos menu hamburguesa
    Then descargamos archivo

    Examples:
      | idioma | perfil             |
      | ENG    | Mexico - Santander |



##---------------------------------------------------------------------------------------------------------
##------------------------PERFIL GRUPO---------------------------------------------------------------------
##---------------------------------------------------------------------------------------------------------

##------------------------PERFIL GRUPO TAP 1---------------------------------------------------------------
##SCENARIO 16-Validar Perfil Grupo Tap 1--------------------------------------------------------------------
  Scenario Outline: Validar Perfil Grupo Tap 1
    And cambiamos <perfil>
    And seleccionamos <idioma>
    And clickeamos Seccion 1 Mastercard y Visa


    Examples:
      | idioma | perfil           |
      | ENG    | Group - Barclays |
##SCENARIO 17-Validar descarga de archivo en Tap 1 con Perfil Grupo----------------------------------------------------------
  Scenario Outline: Validar descarga de archivo en Tap 1 con Perfil Grupo
    And cambiamos <perfil>
    And seleccionamos <idioma>
    And presionamos menu hamburguesa
    Then descargamos archivo

    Examples:
      | idioma | perfil           |
      | ENG    | Group - Barclays |

##SCENARIO 18-Validar boton Group view y descarga de excel en Tap 1 con Perfil Grupo----------------------------------------------------------
  Scenario Outline: Validar boton Group view y descarga de excel en Tap 1 con Perfil Grupo
    And cambiamos <perfil>
    And seleccionamos <idioma>
    And presionamos boton Group view
    Then descargamos excel

    Examples:
      | idioma | perfil           |
      | ENG    | Group - Barclays |

##SCENARIO 19-Validar Aplicacion de Filtros en Tap 1 con Perfil Grupo----------------------------------------------------------
  Scenario Outline: Validar Aplicacion de Filtros en Tap 1 con Perfil Grupo
    And cambiamos <perfil>
    And seleccionamos <idioma>
    And presionamos menu hamburguesa
    Then elegimos Filtros
    And oprimimos <country>,<period>
    And presionamos boton Apply

    Examples:

      | idioma | perfil           | country  | period      |
      | ENG    | Group - Barclays | Alemania | Agosto 2022 |



##------------------------PERFIL GRUPO TAP 2------------------------------------------------------------
##SCENARIO 20-Validar Tap 2----------------------------------------------------------
  Scenario Outline: Validar Tap 2
    And cambiamos <perfil>
    And seleccionamos <idioma>
    And clickeamos Tap 2 Expense Evolution
    Then presionamos boton variations
    ##And pasamos clics variations


    Examples:
      | perfil           | idioma |
      | Group - Barclays | ENG    |

##SCENARIO 21-Validar descarga de archivo en Tap 2 con Perfil Grupo----------------------------------------------------------
  Scenario Outline: Validar descarga de archivo en Tap 2 con Perfil Grupo
    And cambiamos <perfil>
    And seleccionamos <idioma>
    And clickeamos Tap 2 Expense Evolution
    And presionamos menu hamburguesa
    Then descargamos archivo


    Examples:
      | perfil           | idioma |
      | Group - Barclays | ENG    |

##SCENARIO 22-Validar Aplicacion de Filtros en Tap 2 con Perfil Grupo----------------------------------------------------------
  Scenario Outline: Validar Aplicacion de Filtros en Tap 2 con Perfil Grupo
    And cambiamos <perfil>
    And seleccionamos <idioma>
    And clickeamos Tap 2 Expense Evolution
    And presionamos menu hamburguesa
    Then elegimos Filtros
    And llenamos <pais>,<negocio>,<alcance>,<periodo>,<fecha inicio>,<fecha fin>
    And presionamos boton Apply


    Examples:
      | perfil           | idioma | pais     | negocio            | alcance       | periodo | fecha inicio | fecha fin |
      | Group - Barclays | ENG    | Alemania | Adquirente compras | Intraregional | Anual   | 2017         | 2021      |



##------------------------PERFIL GRUPO TAP 3------------------------------------------------------------
##SCENARIO 23-Validar Tap 3------------------------------------------------------------------------------
  Scenario Outline: Validar Tap 3
    And cambiamos <perfil>
    And seleccionamos <idioma>
    And clickeamos Tap 3 Expense Details

    Examples:
      | perfil           | idioma |
      | Group - Barclays | ENG    |

##SCENARIO 24-Validar descarga de archivo en Tap 3 con Perfil Grupo------------------------------------------------------------------------------
  Scenario Outline: Validar descarga de archivo en Tap 3 con Perfil Grupo
    And cambiamos <perfil>
    And seleccionamos <idioma>
    And clickeamos Tap 3 Expense Details
    And presionamos menu hamburguesa
    Then descargamos archivo

    Examples:
      | perfil           | idioma |
      | Group - Barclays | ENG    |

##SCENARIO 25-Validar Boton Related Fees en Tap 3 con Perfil Grupo------------------------------------------------------------------------------
  Scenario Outline: Validar Boton Related Fees en Tap 3 con Perfil Grupo
    And cambiamos <perfil>
    And seleccionamos <idioma>
    And clickeamos Tap 3 Expense Details
    Then presionamos related fees
    And realizamos busqueda <cuota>
    Examples:
      | perfil           | idioma | cuota     |
      | Group - Barclays | ENG    | 3F3529305 |

 ##SCENARIO 26-Validar aplicacion de filtros en Tap 3 con Perfil Grupo------------------------------------------------------------------------------
  Scenario Outline: Validar aplicacion de filtros en Tap 3 con Perfil Grupo
    And cambiamos <perfil>
    And seleccionamos <idioma>
    And clickeamos Tap 3 Expense Details
    And presionamos menu hamburguesa
    Then elegimos Filtros
    And enviamos <pais>,<marca>,<negocio>,<categoria>,<periodo>
    And presionamos boton Apply


    Examples:
      | perfil           | idioma | pais     | marca | negocio            | categoria   | periodo     |
      | Group - Barclays | ENG    | Alemania | Visa  | Adquirente compras | Penalidades | Agosto 2022 |