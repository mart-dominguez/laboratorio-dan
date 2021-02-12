package isi.dan.laboratorios.lab01.domain;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private Integer id;
    private LocalDate fecha;
    private Obra obra;
    private List<PedidoDetalle> detalle;
    private EstadoPedido estado;
}
