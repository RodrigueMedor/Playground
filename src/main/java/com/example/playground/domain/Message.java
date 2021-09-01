package com.example.playground.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@JsonRootName("")
public class Message {
    @JsonProperty("wolfhound")
    List<String> affenpinschers;
    @JsonProperty("whippet")
    List<String> africans;
    @JsonProperty("weimaraner")
    List<String> airedale;
    @JsonProperty("waterdog")
    List<String> akita;
    @JsonProperty("vizsla")
    List<String> appenzeller;
    @JsonProperty("terrier")
    List<String> basenji;
    @JsonProperty("stbernard")
    List<String> beagle;
    @JsonProperty("springer")
    List<String> bluetick;
    @JsonProperty("spaniel")
    List<String> borzoi;
    @JsonProperty("shihtzu")
    List<String> bouvier;
    @JsonProperty("shiba")
    List<String> boxer;
    @JsonProperty("sheepdog")
    List<String> brabancon;
    @JsonProperty("setter")
    List<String> briard;
    @JsonProperty("schnauzer")
    List<String> chihuahua;
    @JsonProperty("schipperke")
    List<String> chow;
    @JsonProperty("samoyed")
    List<String> clumber;
    @JsonProperty("saluki")
    List<String> cockapoo;
    @JsonProperty("rottweiler")
    List<String> australian;

    @JsonProperty("ridgeback")
    List<String> buhund;
    @JsonProperty("retriever")
    List<String> bulldog;
    @JsonProperty("redbone")
    List<String> bullterrier;
    @JsonProperty("pyrenees")
    List<String> cattledog;
    /* List<String> chihuahua;
     List<String> chow;
     List<String> clumber;
     List<String> cockapoo;*/
    @JsonProperty("puggle")
    List<String> collie;
    @JsonProperty("pug")
    List<String> coonhound;
    @JsonProperty("poodle")
    List<String> corgi;
    @JsonProperty("pomeranian")
    List<String> cotondetulear;
    @JsonProperty("pointer")
    List<String> dachshund;
    @JsonProperty("pitbull")
    List<String> dalmatian;
    @JsonProperty("pinscher")
    List<String> dane;
    @JsonProperty("pembroke")
    List<String> deerhound;
    @JsonProperty("pekinese")
    List<String> dhole;
    @JsonProperty("dhole")
    List<String> dingo;
    @JsonProperty("deerhound")
    List<String> doberman;
    @JsonProperty("dane")
    List<String> elkhound;
    @JsonProperty("dalmatian")
    List<String> entlebucher;
    @JsonProperty("dachshund")
    List<String> eskimo;
    @JsonProperty("cotondetulear")
    List<String> finnish;

    @JsonProperty("corgi")
    List<String> frise;
    @JsonProperty("coonhound")
    List<String> germanshepherd;
    @JsonProperty("cockapoo")
    List<String> greyhound;
    @JsonProperty("clumber")
    List<String> groenendael;
    @JsonProperty("chow")
    List<String> havanese;
    @JsonProperty("chihuahua")


    List<String> hound;
    @JsonProperty("cattledog")


    List<String> husky;
    @JsonProperty("cairn")


    List<String> keeshond;
    @JsonProperty("bullterrier")


    List<String> kelpie;
    @JsonProperty("beagle")


    List<String> komondor;
    @JsonProperty("basenji")


    List<String> kuvasz;
    @JsonProperty("australian")


    List<String> labradoodle;
    @JsonProperty("appenzeller")


    List<String> labrador;
    @JsonProperty("akita")


    List<String> leonberg;
    @JsonProperty("airedale")


    List<String> lhasa;
    @JsonProperty("african")


    List<String> malamute;
    @JsonProperty("affenpinscher")


    List<String> malinois;
    @JsonProperty("bluetick")


    List<String> maltese;
    @JsonProperty("borzoi")


    List<String> mastiff;
    @JsonProperty("bouvier")


    List<String> english;

    @JsonProperty("boxer")

    List<String> mexicanhairless;
    @JsonProperty("brabancon")

    List<String> mix;
    @JsonProperty("briard")

    List<String> mounta;

    @JsonProperty("buhund")

    List<String> newfoundland;
    @JsonProperty("bulldog")

    List<String> otterhound;
    @JsonProperty("dingo")

    List<String> ovchar;

    @JsonProperty("doberman")

    List<String> papillon;
    @JsonProperty("elkhound")

    List<String> pekinese;
    @JsonProperty("entlebucher")

    List<String> pembroke;
    @JsonProperty("eskimo")

    List<String> pinscher;


    @JsonProperty("finnish")

    List<String> pitbull;
    @JsonProperty("frise")

    List<String> pointer;

    @JsonProperty("germanshepherd")

    List<String> pomeranian;
    @JsonProperty("greyhound")

    List<String> poodle;
    @JsonProperty("groenendael")

    List<String> pug;
    @JsonProperty("havanese")
    List<String> puggle;
    @JsonProperty("hound")
    List<String> pyrenees;
    @JsonProperty("husky")
    List<String> redbone;
    @JsonProperty("keeshond")
    List<String> retriev;

    @JsonProperty("kelpie")
    List<String> ridgeback;
    @JsonProperty("komondor")
    List<String> rhodesian;
    @JsonProperty("kuvasz")
    List<String> rottweiler;
    @JsonProperty("labradoodle")
    List<String> saluki;
    @JsonProperty("labrador")
    List<String> samoyed;
    @JsonProperty("leonberg")
    List<String> schipperke;
    @JsonProperty("lhasa")
    List<String> schnauzer;
    @JsonProperty("malamute")
    List<String> giant;

    @JsonProperty("malinois")
    List<String> setter;

    @JsonProperty("maltese")
    List<String> sheepdog;
    @JsonProperty("mastiff")
    List<String> shiba;
    @JsonProperty("mexicanhairless")
    List<String> shihtzu;
    @JsonProperty("mix")
    List<String> spaniel;
    @JsonProperty("mountain")
    List<String> springer;
    @JsonProperty("newfoundland")
    List<String> stbernard;
    @JsonProperty("otterhound")
    List<String> terrier;
    @JsonProperty("ovcharka")
    List<String> vizsla;
    @JsonProperty("papillon")
    List<String> waterdog;

/*  @JsonProperty("affenpinscher")  List<String> weimaraner;
  @JsonProperty("affenpinscher")  List<String> whippet;
  @JsonProperty("affenpinscher")  List<String> wolfhound;*/
}
