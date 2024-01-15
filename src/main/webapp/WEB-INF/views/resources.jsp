<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Resources</title>
    <style>
    body {
      padding: 4rem 2rem;
      font-family: Poppins;
    }

    .hr-line {
      border-top: 1px solid transparent;
      background: linear-gradient(white, white) padding-box,
        linear-gradient(90deg, White, DimGrey, White) border-box;
    }

    h4 {
      color: #454646;
      & sl-icon {
        position: relative;
        top: 2px;
      }
    }

    .card {
      min-width: 260px;
      height: 100%;
      border-radius: 15px !important;
      box-shadow: 0 15px 15px LightGrey;
      background-color: #f8f8f8 !important;
      border: 1px solid LightGrey !important;
    }

    .row {
      justify-content: center;
      align-items: center;
    }

    .lottie_container {
      width: 240px;
      cursor: pointer;
    }

    .ratio-fix {
      aspect-ratio: 1 / 1;
    }

    .lottie-info {
      color: #9b9b9b;
    }

    .card-body {
      min-width: 180px;
    }

    .card-text {
      font-weight: 200;
      min-width: 200px;
    }

    .icon-link {
      height: 40px;
      width: 40px;
      color: DimGrey;
      background-color: transparent;
      border: 1px solid DimGrey;
      border-radius: 50%;
      padding: 0;
      margin: 0;
      cursor: pointer;
      text-decoration: none;
      transition: all 0.2s ease-in-out;
      &:hover {
        border: 1px solid DodgerBlue;
        transform: scale(1.2);
        color: DodgerBlue;
      }
      & sl-icon {
        margin-left: 8px;
      }
    }

    #Lottie_2 {
      transform: scale(1.2);
    }

    #Lottie_3 {
      transform: scale(1.25);
    }

    </style>
    <script>
    const player_1 = document.getElementById('Lottie_2');

    player_1.addEventListener('ready', () => {
      LottieInteractivity.create({
      player: player_1.getLottie(),
      mode:"cursor",
        actions: [
            {
                type: "click",
                forceFlag: false,
            }
        ]
        });
    });

    const player_2 = document.getElementById('Lottie_3');

    player_2.addEventListener('ready', () => {
      LottieInteractivity.create({
      player: player_2.getLottie(),
      mode:"scroll",
        actions: [
            {
            visibility: [0,1],
            type: 'seek',
            frames: [0, 90],
            }
        ]
        });
    });

    </script>
  </head>
 <body>
   <h4 class="text-center fw-bold"><sl-icon class="me-3" name="postcard-heart"></sl-icon>Lottie Cards</h4>
   <div class="hr-line mt-4 mb-4"></div>
   <div class="d-flex flex-wrap gap-5 justify-content-evenly pt-4">
     <div class="col-lg-5">
       <div class="card p-4">
         <div class="row">
           <div class="lottie_container m-3">
             <dotlottie-player src="https://assets.codepen.io/9400490/geometry.lottie" background="transparent" loop="" direction="1" autoplay="">
             </dotlottie-player>
           </div>
           <div class="col-md">
             <div class="card-body">
               <h5 class="fw-bold">Impossible Geometry</h5>
               <hr>
               <p class="card-text">Shapes that are not possible and create an optical illusion are often referred to as <em>impossible objects</em>. They consists of a 2D figure which is interpreted as 3D object and usually the impossibility becomes apparent after viewing the figure for a few seconds. Impossible objects are of interest to psychologist, mathematicians and artists and may have applications in computer vision and human cognition.</p>
               <hr>
               <p class="text-center pt-2">
                 <a class="icon-link" title="More Info" aria-label="More Information" href="#"><sl-icon class="fs-5" name="info-lg"></sl-icon></a>
               </p>
             </div>
           </div>
         </div>
       </div>
     </div>
     <div class="col-lg-5">
       <div class="card p-4">
         <div class="row">
           <div class="lottie_container m-3">
             <dotlottie-player id="Lottie_2" src="https://assets.codepen.io/9400490/circle+theorem.lottie" background="transparent">
             </dotlottie-player>
           </div>
           <div class="col-md">
             <div class="card-body">
               <h5 class="fw-bold">Circle Theorems</h5>
               <h6 class="lottie-info">Click the circle to play animation</h6>
               <hr>
               <p class="card-text">Circle theorems are properties that show relationships between angles within the geometry of a circle. We can use these theorems along with prior knowledge of other angle properties to calculate missing angles, without the use of a protractor. There are seven main circle theorems and these have very useful applications within design and engineering.</p>
               <hr>
               <p class="text-center pt-2">
                 <a class="icon-link" title="More Info" aria-label="More Information" href="#"><sl-icon class="fs-5" name="info-lg"></sl-icon></a>
               </p>
             </div>
           </div>
         </div>
       </div>
     </div>
     <div class="col-lg-5">
       <div class="card p-4">
         <div class="row">
           <div class="lottie_container ratio-fix m-4">
             <dotlottie-player id="Lottie_3" src="https://assets.codepen.io/9400490/superposition.lottie" background="transparent">
             </dotlottie-player>
           </div>
           <div class="col-md">
             <div class="card-body">
               <h5 class="fw-bold">Superposition Equipotential Lines</h5>
               <hr>
               <p class="card-text">One of the rules for static electric fields and conductors is that the electric field must be perpendicular to the surface of any conductor. This implies that a conductor is an equipotential surface in static situations. Given the electric field lines, the equipotential lines can be drawn simply by making them perpendicular to the electric field lines. Conversely, given the equipotential lines, the electric field lines can be drawn by making them perpendicular to the equipotentials.</p>
               <hr>
               <p class="text-center pt-2">
                 <a class="icon-link" title="More Info" aria-label="More Information" href="#"><sl-icon class="fs-5" name="info-lg"></sl-icon></a>
               </p>
             </div>
           </div>
         </div>
       </div>
     </div>
     <div class="col-lg-5">
       <div class="card p-4">
         <div class="row">
           <div class="lottie_container m-3">
             <dotlottie-player src="https://assets.codepen.io/9400490/optics.lottie" background="transparent" controls>
             </dotlottie-player>
           </div>
           <div class="col-md">
             <div class="card-body">
               <h5 class="fw-bold">Dispersion of Light</h5>
               <h6 class="lottie-info">Adjust playback using controls</h6>
               <hr>
               <p class="card-text">Any type of wave can exhibit dispersion. Sound, light and electromagnetic waves can be dispersed according to wavelength. Dispersion occurs whenever the speed of propagation depends on wavelength, thus separating and spreading out various wavelengths. Rainbows are produced by a combination of refraction and reflection. Light enters a drop of water and is reflected from the back of the drop. Therefore, the light is refracted both as it enters and as it leaves the drop.</p>
               <hr>
               <p class="text-center pt-2">
                 <a class="icon-link" title="More Info" aria-label="More Information" href="#"><sl-icon class="fs-5" name="info-lg"></sl-icon></a>
               </p>
             </div>
           </div>
         </div>
       </div>
     </div>
   </div>
   <div class="hr-line mt-5 mb-4"></div>
   <p class="footer fs-6 fw-bold text-center text-muted">Powered by:</p>
   <p class="text-center">
     <a title="Bootstrap" aria-label="More information about Bootstrap" href="https://getbootstrap.com" target="_blank"><img src="https://assets.codepen.io/9400490/Bootstrap.svg" alt="Bootstrap" width="30" height="30"></a>
     <a title="Shoelace" aria-label="More information about Shoelace" href="https://shoelace.style/components/icon" target="_blank"><img src="https://assets.codepen.io/9400490/Shoelace.svg" alt="FontAwesome" width="30" height="30"></a>
     <a title="LottieFiles" aria-label="More information about LottieFiles" href="https://lottiefiles.com" target="_blank"><img src="https://assets.codepen.io/9400490/Lottie.svg" alt="FontAwesome" width="30" height="30"></a>
   </p>
 </body>
</html>