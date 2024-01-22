import React, { useState, useEffect } from 'react';
import { uniqueId } from 'lodash'; 
import { useSelector, useDispatch } from 'react-redux';
import { Layout, Select, Form, Menu, Button, Row, Col, Statistic, Progress} from 'antd';
import { fetch, findInseEscolas } from '../redux';  

const { Header, Footer, Sider, Content } = Layout;


export default function Dashboard(){
 
  let fetching = useSelector((state) => state.sagas.fetching); 
  let listaRegioes = useSelector((state) => state.sagas.listaRegioes); 
  let listaUFs = useSelector((state) => state.sagas.listaUFs); 
  let listaMunicipios = useSelector((state) => state.sagas.listaMunicipios); 
  let listaEscolas = useSelector((state) => state.sagas.listaEscolas); 
  let listaInseEscolas = useSelector((state) => state.sagas.listaInseEscolas); 
   
  const dispatch = useDispatch();

  useEffect(() => {  
    dispatch(fetch());
  }, []);
 
  let [idRegiao, setIdRegiao] = useState(null); 
  let [idUF, setIdUF] = useState(null); 
  let [idMunicipio, setIdMunicipio] = useState(null); 
  let [idEscola, setIdEscola] = useState(null); 

  let filter = {
    idRegiao: null,
    idUF: null,
    idMunicipio: null,
    idEscola: null
  }

  const items = [
    {
      label: '2021',
      key: 2021,
    },
    {
      label: '2019',
      key: 2019,
      disabled: true
    },
    {
        label: '2015',
        key: 2015,
        disabled: true
    },
    {
        label: '2011 a 2013',
        key: '2011',
        disabled: true
      }
    ]

  const headerStyle = {
    textAlign: 'center',
    color: '#fff',
    height: 64, 
    backgroundColor: '#fff'
  }; 
  const siderStyle = {
    textAlign: 'center',
    lineHeight: '120px',   
    backgroundColor: '#fff',
  }; 

  const setRegiao = (value, object) => {
    setIdRegiao(value);
    dispatch(findInseEscolas({idRegiao: value}));
    setIdUF(null);
    setIdMunicipio(null);
    setIdEscola(null);
  };
  const setUF = (value, object) => {
    setIdUF(value);
    dispatch(findInseEscolas({idUF: value})); 
    setIdMunicipio(null);
    setIdEscola(null);
  };
  const setMunicipio = (value, object) => {
    setIdMunicipio(value); 
    dispatch(findInseEscolas({idMunicipio: value})); 
    setIdEscola(null);
  };
  const setEscola = (value, object) => {
    setIdEscola(value); 
    dispatch(findInseEscolas({idEscola: value}));
  };

  const findInse = (e) => {
    filter.idRegiao = idRegiao;
    filter.idUF = idUF;
    filter.idMunicipio = idMunicipio;
    filter.idEscola = idEscola;
    dispatch(findInseEscolas(filter));
  }

  const changeAno = (e) => {

  }
 
  return (
    <Layout >
      <Header style={headerStyle}> <Menu onClick={changeAno} selectedKeys={['2021']} mode="horizontal" items={items} /> </Header>
      <Layout>
        <Content>
            <Form 
            labelCol={{ span: 7}}
            wrapperCol={{ span: 14 }}
            layout="horizontal"
            style={{ margin: 30}}
            >
            <Form.Item label="Regiões">
                <Select value={idRegiao} fieldNames={{label: 'nome', value: 'id'}} options={listaRegioes} onChange={(value, object) => {setRegiao(value, object)}} placeholder="Selecione uma região" />
            </Form.Item>

            <Form.Item label="UF">
                <Select value={idUF} showSearch disabled={(!listaUFs || listaUFs.length===0)} fieldNames={{label: 'nome', value: 'id'}} options={listaUFs} onChange={(value, object) => {setUF(value, object)}} placeholder="Selecione uma UF" />
            </Form.Item>

            <Form.Item label="Municípios">
                <Select value={idMunicipio} showSearch disabled={(!listaMunicipios || listaMunicipios.length===0)}  fieldNames={{label: 'nome', value: 'id'}} options={listaMunicipios} onChange={(value, object) => {setMunicipio(value, object)}} placeholder="Selecione um município" />
            </Form.Item>

            <Form.Item label="Escola">
                <Select value={idEscola} showSearch disabled={(!listaEscolas || listaEscolas.length===0)} fieldNames={{label: 'nome', value: 'id'}} options={listaEscolas} onChange={(value, object) => {setEscola(value, object)}} placeholder="Selecione uma escola" />
            </Form.Item> 
            </Form>

            {listaInseEscolas && listaInseEscolas[0] &&
            <div>
                <Row gutter={16} style={{textAlign: 'center', backgroundColor:'#fff', paddingTop: 30}}>
                    <Col span={6}>
                        <Statistic title="Ano" value={listaInseEscolas[0].anoInicio} groupSeparator={''}/>
                    </Col>
                    <Col span={6}>
                        <Statistic title="Valor INSE" value={listaInseEscolas[0].valorInse} />
                    </Col>
                    <Col span={6}>
                        <Statistic title="Classificação" value={listaInseEscolas[0].classificacaoModel.nome} />
                    </Col>
                    <Col span={6}>
                        <Statistic title="Quantidade Alunos" value={listaInseEscolas[0].quantidadeAlunos} />
                    </Col>
                </Row>
                <Row gutter={16} style={{textAlign: 'center', backgroundColor:'#fff', paddingTop: 30}}>
                    <Col span={6}>
                        <Statistic title="Porcentagem Nível I" value={listaInseEscolas[0].porcentagenteNivelI} />
                    </Col>
                    <Col span={6}>
                        <Statistic title="Porcentagem Nível II" value={listaInseEscolas[0].porcentagenteNivelII} />
                    </Col>
                    <Col span={6}>
                        <Statistic title="Porcentagem Nível III" value={listaInseEscolas[0].porcentagenteNivelIII} />
                    </Col>
                    <Col span={6}>
                        <Statistic title="Porcentagem Nível IV" value={listaInseEscolas[0].porcentagenteNivelIV} />
                    </Col>
                </Row>
                <Row gutter={16} style={{textAlign: 'center', backgroundColor:'#fff', paddingTop: 30}}>
                    <Col span={6}>
                        <Statistic title="Porcentagem Nível V" value={listaInseEscolas[0].porcentagenteNivelV} />
                    </Col>
                    <Col span={6}>
                        <Statistic title="Porcentagem Nível VI" value={listaInseEscolas[0].porcentagenteNivelVI} />
                    </Col>
                    <Col span={6}>
                        <Statistic title="Porcentagem Nível VII" value={listaInseEscolas[0].porcentagenteNivelVII} />
                    </Col>
                    <Col span={6}>
                        <Statistic title="Porcentagem Nível VIII" value={listaInseEscolas[0].porcentagenteNivelVIII} />
                    </Col>
                </Row>
            </div>
            }
        </Content>
      </Layout> 
    </Layout>
  )
}