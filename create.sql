
    create table ts_curriculo (
       id number(19,0) generated as identity,
        arquivo blob,
        dt_envio_curriculo timestamp not null,
        email varchar2(255 char) not null,
        nome_candidato varchar2(255 char) not null,
        ranking number(10,0) not null,
        vaga_id number(19,0),
        primary key (id)
    );

    create table ts_feedback (
       id number(19,0) generated as identity,
        aprovado number(1,0),
        dt_analise timestamp not null,
        dt_envio_feedback timestamp,
        envio_feedback number(1,0) not null,
        feedback varchar2(255 char) not null,
        primary key (id)
    );

    create table ts_habilidade (
       id number(19,0) generated as identity,
        nome varchar2(255 char) not null,
        primary key (id)
    );

    create table ts_nivel_permissao (
       id number(19,0) generated as identity,
        descricao varchar2(255 char) not null,
        nome varchar2(255 char) not null,
        primary key (id)
    );

    create table ts_usuario (
       id number(19,0) generated as identity,
        dt_alteracao timestamp,
        dt_criacao timestamp not null,
        email varchar2(255 char) not null,
        nome varchar2(80 char) not null,
        senha varchar2(16 char) not null,
        status number(1,0) not null,
        nivel_permissao_id number(19,0),
        primary key (id)
    );

    create table ts_vaga (
       id number(19,0) generated as identity,
        descricao_cargo varchar2(255 char),
        descricao_vaga varchar2(1000 char),
        dt_abertura timestamp not null,
        dt_encerramento timestamp not null,
        nome varchar2(255 char),
        usuario_id number(19,0),
        primary key (id)
    );

    create table ts_vaga_habilidades (
       vaga_id number(19,0) not null,
        habilidades_id number(19,0) not null
    );

    alter table ts_curriculo 
       add constraint FK6qeabss9t0fear3vl2qt06ppg 
       foreign key (vaga_id) 
       references ts_vaga;

    alter table ts_usuario 
       add constraint FK7sj71w293ax1ue1m8v9jmr5nn 
       foreign key (nivel_permissao_id) 
       references ts_nivel_permissao;

    alter table ts_vaga 
       add constraint FK8hfilu32b0vf4t76x7f3y7b5c 
       foreign key (usuario_id) 
       references ts_usuario;

    alter table ts_vaga_habilidades 
       add constraint FKgv70jw5n6ge0tc4vnrtqa1mb0 
       foreign key (habilidades_id) 
       references ts_habilidade;

    alter table ts_vaga_habilidades 
       add constraint FKbcgk37dqacp7syjplitpbpd3t 
       foreign key (vaga_id) 
       references ts_vaga;
